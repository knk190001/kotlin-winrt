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

@ABIMarker(IHidOutputReport.ABI::class)
@Signature("{62cb2544-c896-4463-93c1-df9db053c450}")
@Guid("62cb2544c896446393c1df9db053c450")
@WinRTInterface("62cb2544c896446393c1df9db053c450")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHidOutputReport.ByReference::class)
public interface IHidOutputReport : NativeMapped, IWinRTInterface {
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
      IByReference<IHidOutputReport> {
    public override fun getValue() = ABI.makeIHidOutputReport(pointer.getPointer(0))

    public fun setValue(value: IHidOutputReport_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHidOutputReport {
    public val __1354037645_Ptr: Pointer?

    public val _1354037645_VtblPtr: Pointer?
      get() = __1354037645_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): WinDef.USHORT {
      val fnPtr = _1354037645_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1354037645_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Data(): IBuffer? {
      val fnPtr = _1354037645_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1354037645_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Data(value: IBuffer?): Unit {
      val fnPtr = _1354037645_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1354037645_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun GetBooleanControl(usagePage: WinDef.USHORT, usageId: WinDef.USHORT):
        HidBooleanControl? {
      val fnPtr = _1354037645_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HidBooleanControl>()
      val hr = fn.invokeHR(arrayOf(__1354037645_Ptr, usagePage, usageId, result))
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
      val fnPtr = _1354037645_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HidBooleanControl>()
      val hr = fn.invokeHR(arrayOf(__1354037645_Ptr, marshalToNative(controlDescription), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HidBooleanControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetNumericControl(usagePage: WinDef.USHORT, usageId: WinDef.USHORT):
        HidNumericControl? {
      val fnPtr = _1354037645_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HidNumericControl>()
      val hr = fn.invokeHR(arrayOf(__1354037645_Ptr, usagePage, usageId, result))
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
      val fnPtr = _1354037645_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HidNumericControl>()
      val hr = fn.invokeHR(arrayOf(__1354037645_Ptr, marshalToNative(controlDescription), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HidNumericControl>(result.getValue())
      return resultValue
    }
  }

  public class IHidOutputReport_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1354037645_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHidOutputReport, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("62cb2544c896446393c1df9db053c450")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHidOutputReport(ptr: Pointer?): WithDefault = IHidOutputReport_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHidOutputReport {
      val address = segment.toRawLongValue()
      return makeIHidOutputReport(Pointer(address))
    }

    public override fun toNative(obj: IHidOutputReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1354037645_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHidOutputReport): Array<IHidOutputReport?> = (elements as
        Array<IHidOutputReport?>).castToImpl<IHidOutputReport,IHidOutputReport_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHidOutputReport?> =
        arrayOfNulls<IHidOutputReport_Impl>(size) as Array<IHidOutputReport?>
  }
}
