package Windows.UI.Xaml.Media

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

@ABIMarker(RectangleGeometry.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.RectangleGeometry;{a25a1f58-c575-4196-91cf-9fdfb10445c3})")
@WinRTByReference(brClass = RectangleGeometry.ByReference::class)
public class RectangleGeometry(
  ptr: JNAPointer? = NULL
) : Geometry(ptr), IRectangleGeometry.WithDefault, IWinRTObject {
  private val __887037819_Interface: IRectangleGeometry.WithDefault by lazy {
    as_887037819()
  }


  public override val __887037819_Ptr: JNAPointer? by lazy {
    __887037819_Interface.__887037819_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__887037819_Interface)

  public constructor() : this(ABI.activate())

  private fun as_887037819(): IRectangleGeometry.WithDefault {
    if(pointer == NULL) {
      return(IRectangleGeometry.ABI.makeIRectangleGeometry(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRectangleGeometry>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRectangleGeometry.ABI.makeIRectangleGeometry(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RectangleGeometry> {
    public override fun getValue() = RectangleGeometry(pointer.getPointer(0))

    public fun setValue(value: RectangleGeometry): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RectangleGeometry, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IRectangleGeometryStatics_Instance: IRectangleGeometryStatics by lazy {
      createIRectangleGeometryStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.RectangleGeometry".toHandle(),
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

    public fun createIRectangleGeometryStatics(): IRectangleGeometryStatics {
      val refiid = Guid.REFIID(IRectangleGeometryStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.RectangleGeometry".toHandle(),refiid,interfacePtr)
      val result = IRectangleGeometryStatics.ABI.makeIRectangleGeometryStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): RectangleGeometry {
      val address = segment.toRawLongValue()
      return RectangleGeometry(Pointer(address))
    }

    public override fun toNative(obj: RectangleGeometry): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_RectProperty() = ABI.IRectangleGeometryStatics_Instance.get_RectProperty()
  }
}
