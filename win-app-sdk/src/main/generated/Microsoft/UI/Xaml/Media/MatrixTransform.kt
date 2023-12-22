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

@ABIMarker(MatrixTransform.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.MatrixTransform;{f03138e1-addd-59fa-b993-3ea69b888ace})")
@WinRTByReference(brClass = MatrixTransform.ByReference::class)
public class MatrixTransform(
  ptr: JNAPointer? = NULL
) : Transform(ptr), IMatrixTransform.WithDefault, IWinRTObject {
  private val __751461286_Interface: IMatrixTransform.WithDefault by lazy {
    as_751461286()
  }


  public override val __751461286_Ptr: JNAPointer? by lazy {
    __751461286_Interface.__751461286_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__751461286_Interface)

  public constructor() : this(ABI.activate())

  private fun as_751461286(): IMatrixTransform.WithDefault {
    if(pointer == NULL) {
      return(IMatrixTransform.ABI.makeIMatrixTransform(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMatrixTransform>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMatrixTransform.ABI.makeIMatrixTransform(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MatrixTransform> {
    public override fun getValue() = MatrixTransform(pointer.getPointer(0))

    public fun setValue(value: MatrixTransform): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MatrixTransform, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IMatrixTransformStatics_Instance: IMatrixTransformStatics by lazy {
      createIMatrixTransformStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.MatrixTransform".toHandle(),
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

    public fun createIMatrixTransformStatics(): IMatrixTransformStatics {
      val refiid = Guid.REFIID(IMatrixTransformStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.MatrixTransform".toHandle(),refiid,interfacePtr)
      val result = IMatrixTransformStatics.ABI.makeIMatrixTransformStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MatrixTransform {
      val address = segment.toRawLongValue()
      return MatrixTransform(Pointer(address))
    }

    public override fun toNative(obj: MatrixTransform): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_MatrixProperty() = ABI.IMatrixTransformStatics_Instance.get_MatrixProperty()
  }
}
