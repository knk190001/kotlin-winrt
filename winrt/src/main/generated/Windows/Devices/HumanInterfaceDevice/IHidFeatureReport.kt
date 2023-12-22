package Windows.Devices.HumanInterfaceDevice

import Windows.Storage.Streams.IBuffer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IHidFeatureReport.ABI::class)
@Signature("{841d9b79-5ae5-46e3-82ef-1fec5c8942f4}")
@Guid("841d9b795ae546e382ef1fec5c8942f4")
@WinRTInterface("841d9b795ae546e382ef1fec5c8942f4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHidFeatureReport.ByReference::class)
public interface IHidFeatureReport : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): WinDef.USHORT

  @InterfaceMethod(1)
  public fun get_Data(): IBuffer?

  @InterfaceMethod(2)
  public fun put_Data(value: IBuffer?): Unit

  @InterfaceMethod(3)
  public fun GetBooleanControl(usagePage: WinDef.USHORT, usageId: WinDef.USHORT): HidBooleanControl?

  @InterfaceMethod(4)
  public fun GetBooleanControlByDescription(controlDescription: HidBooleanControlDescription?):
      HidBooleanControl?

  @InterfaceMethod(5)
  public fun GetNumericControl(usagePage: WinDef.USHORT, usageId: WinDef.USHORT): HidNumericControl?

  @InterfaceMethod(6)
  public fun GetNumericControlByDescription(controlDescription: HidNumericControlDescription?):
      HidNumericControl?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHidFeatureReport> {
    public override fun getValue() = ABI.makeIHidFeatureReport(pointer.getPointer(0))

    public fun setValue(value: IHidFeatureReport_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHidFeatureReport {
    public val __1464957230_Ptr: Pointer?

    public val _1464957230_VtblPtr: Pointer?
      get() = __1464957230_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): WinDef.USHORT {
      val fnPtr = _1464957230_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1464957230_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Data(): IBuffer? {
      val fnPtr = _1464957230_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1464957230_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Data(value: IBuffer?): Unit {
      val fnPtr = _1464957230_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1464957230_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun GetBooleanControl(usagePage: WinDef.USHORT, usageId: WinDef.USHORT):
        HidBooleanControl? {
      val fnPtr = _1464957230_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HidBooleanControl>()
      val hr = fn.invokeHR(arrayOf(__1464957230_Ptr, usagePage, usageId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HidBooleanControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override
        fun GetBooleanControlByDescription(controlDescription: HidBooleanControlDescription?):
        HidBooleanControl? {
      val fnPtr = _1464957230_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HidBooleanControl>()
      val hr = fn.invokeHR(arrayOf(__1464957230_Ptr, marshalToNative(controlDescription), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HidBooleanControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetNumericControl(usagePage: WinDef.USHORT, usageId: WinDef.USHORT):
        HidNumericControl? {
      val fnPtr = _1464957230_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HidNumericControl>()
      val hr = fn.invokeHR(arrayOf(__1464957230_Ptr, usagePage, usageId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HidNumericControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override
        fun GetNumericControlByDescription(controlDescription: HidNumericControlDescription?):
        HidNumericControl? {
      val fnPtr = _1464957230_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HidNumericControl>()
      val hr = fn.invokeHR(arrayOf(__1464957230_Ptr, marshalToNative(controlDescription), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HidNumericControl>(result.getValue())
      return resultValue
    }
  }

  public class IHidFeatureReport_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1464957230_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHidFeatureReport, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("841d9b795ae546e382ef1fec5c8942f4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHidFeatureReport(ptr: Pointer?): WithDefault = IHidFeatureReport_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHidFeatureReport {
      val address = segment.toRawLongValue()
      return makeIHidFeatureReport(Pointer(address))
    }

    public override fun toNative(obj: IHidFeatureReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1464957230_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHidFeatureReport): Array<IHidFeatureReport?> = (elements
        as Array<IHidFeatureReport?>).castToImpl<IHidFeatureReport,IHidFeatureReport_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHidFeatureReport?> =
        arrayOfNulls<IHidFeatureReport_Impl>(size) as Array<IHidFeatureReport?>
  }
}
