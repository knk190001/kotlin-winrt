package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.IBackgroundTrigger.ABI.IID
import Windows.Devices.Geolocation.VisitMonitoringScope
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGeovisitTrigger.ABI::class)
@Signature("{4818edaa-04e1-4127-9a4c-19351b8a80a4}")
@Guid("4818edaa04e141279a4c19351b8a80a4")
@WinRTInterface("4818edaa04e141279a4c19351b8a80a4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeovisitTrigger.ByReference::class)
public interface IGeovisitTrigger : NativeMapped, IWinRTInterface, IBackgroundTrigger {
  @InterfaceMethod(0)
  public fun get_MonitoringScope(): VisitMonitoringScope?

  @InterfaceMethod(1)
  public fun put_MonitoringScope(value: VisitMonitoringScope?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGeovisitTrigger> {
    public override fun getValue() = ABI.makeIGeovisitTrigger(pointer.getPointer(0))

    public fun setValue(value: IGeovisitTrigger_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeovisitTrigger, IBackgroundTrigger.WithDefault {
    public val __1839809107_Ptr: Pointer?

    public val _1839809107_VtblPtr: Pointer?
      get() = __1839809107_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MonitoringScope(): VisitMonitoringScope? {
      val fnPtr = _1839809107_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VisitMonitoringScope>()
      val hr = fn.invokeHR(arrayOf(__1839809107_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VisitMonitoringScope>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_MonitoringScope(value: VisitMonitoringScope?): Unit {
      val fnPtr = _1839809107_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1839809107_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGeovisitTrigger_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBackgroundTrigger {
    public override val __54213927_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1839809107_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1839809107_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeovisitTrigger, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4818edaa04e141279a4c19351b8a80a4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeovisitTrigger(ptr: Pointer?): WithDefault = IGeovisitTrigger_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeovisitTrigger {
      val address = segment.toRawLongValue()
      return makeIGeovisitTrigger(Pointer(address))
    }

    public override fun toNative(obj: IGeovisitTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1839809107_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeovisitTrigger): Array<IGeovisitTrigger?> = (elements as
        Array<IGeovisitTrigger?>).castToImpl<IGeovisitTrigger,IGeovisitTrigger_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeovisitTrigger?> =
        arrayOfNulls<IGeovisitTrigger_Impl>(size) as Array<IGeovisitTrigger?>
  }
}
