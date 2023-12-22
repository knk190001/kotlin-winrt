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

@ABIMarker(LineGeometry.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.LineGeometry;{30edd4a2-8fc5-40af-a7a2-c27fe7aa1363})")
@WinRTByReference(brClass = LineGeometry.ByReference::class)
public class LineGeometry(
  ptr: JNAPointer? = NULL
) : Geometry(ptr), ILineGeometry.WithDefault, IWinRTObject {
  private val __308420478_Interface: ILineGeometry.WithDefault by lazy {
    as_308420478()
  }


  public override val __308420478_Ptr: JNAPointer? by lazy {
    __308420478_Interface.__308420478_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__308420478_Interface)

  public constructor() : this(ABI.activate())

  private fun as_308420478(): ILineGeometry.WithDefault {
    if(pointer == NULL) {
      return(ILineGeometry.ABI.makeILineGeometry(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILineGeometry>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILineGeometry.ABI.makeILineGeometry(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<LineGeometry> {
    public override fun getValue() = LineGeometry(pointer.getPointer(0))

    public fun setValue(value: LineGeometry): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LineGeometry, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ILineGeometryStatics_Instance: ILineGeometryStatics by lazy {
      createILineGeometryStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.LineGeometry".toHandle(),
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

    public fun createILineGeometryStatics(): ILineGeometryStatics {
      val refiid = Guid.REFIID(ILineGeometryStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.LineGeometry".toHandle(),refiid,interfacePtr)
      val result = ILineGeometryStatics.ABI.makeILineGeometryStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): LineGeometry {
      val address = segment.toRawLongValue()
      return LineGeometry(Pointer(address))
    }

    public override fun toNative(obj: LineGeometry): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_StartPointProperty() = ABI.ILineGeometryStatics_Instance.get_StartPointProperty()

    public fun get_EndPointProperty() = ABI.ILineGeometryStatics_Instance.get_EndPointProperty()
  }
}
