package Microsoft.UI.Xaml.Media

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(Matrix3DProjection.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Matrix3DProjection;{fc3338ef-f390-5bb1-932e-3b7c08788187})")
@WinRTByReference(brClass = Matrix3DProjection.ByReference::class)
public class Matrix3DProjection(
  ptr: JNAPointer? = NULL
) : Projection(ptr), IMatrix3DProjection.WithDefault, IWinRTObject {
  private val __656785362_Interface: IMatrix3DProjection.WithDefault by lazy {
    as_656785362()
  }


  public override val __656785362_Ptr: JNAPointer? by lazy {
    __656785362_Interface.__656785362_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__656785362_Interface)

  public constructor() : this(ABI.activate())

  private fun as_656785362(): IMatrix3DProjection.WithDefault {
    if(pointer == NULL) {
      return(IMatrix3DProjection.ABI.makeIMatrix3DProjection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMatrix3DProjection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMatrix3DProjection.ABI.makeIMatrix3DProjection(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<Matrix3DProjection> {
    public override fun getValue() = Matrix3DProjection(pointer.getPointer(0))

    public fun setValue(value: Matrix3DProjection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Matrix3DProjection, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IMatrix3DProjectionStatics_Instance: IMatrix3DProjectionStatics by lazy {
      createIMatrix3DProjectionStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Matrix3DProjection".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIMatrix3DProjectionStatics(): IMatrix3DProjectionStatics {
      val refiid = Guid.REFIID(IMatrix3DProjectionStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Matrix3DProjection".toHandle(),refiid,interfacePtr)
      val result = IMatrix3DProjectionStatics.ABI.makeIMatrix3DProjectionStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Matrix3DProjection {
      val address = segment.toRawLongValue()
      return Matrix3DProjection(Pointer(address))
    }

    public override fun toNative(obj: Matrix3DProjection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ProjectionMatrixProperty() =
        ABI.IMatrix3DProjectionStatics_Instance.get_ProjectionMatrixProperty()
  }
}
