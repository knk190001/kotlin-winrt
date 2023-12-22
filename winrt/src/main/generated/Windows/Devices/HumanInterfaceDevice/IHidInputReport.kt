package Windows.Devices.HumanInterfaceDevice

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IHidInputReport.ABI::class)
@Signature("{c35d0e50-f7e7-4e8d-b23e-cabbe56b90e9}")
@Guid("c35d0e50f7e74e8db23ecabbe56b90e9")
@WinRTInterface("c35d0e50f7e74e8db23ecabbe56b90e9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHidInputReport.ByReference::class)
public interface IHidInputReport : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): WinDef.USHORT

  @InterfaceMethod(1)
  public fun get_Data(): IBuffer?

  @InterfaceMethod(2)
  public fun get_ActivatedBooleanControls(): IVectorView<HidBooleanControl?>?

  @InterfaceMethod(3)
  public fun get_TransitionedBooleanControls(): IVectorView<HidBooleanControl?>?

  @InterfaceMethod(4)
  public fun GetBooleanControl(usagePage: WinDef.USHORT, usageId: WinDef.USHORT): HidBooleanControl?

  @InterfaceMethod(5)
  public fun GetBooleanControlByDescription(controlDescription: HidBooleanControlDescription?):
      HidBooleanControl?

  @InterfaceMethod(6)
  public fun GetNumericControl(usagePage: WinDef.USHORT, usageId: WinDef.USHORT): HidNumericControl?

  @InterfaceMethod(7)
  public fun GetNumericControlByDescription(controlDescription: HidNumericControlDescription?):
      HidNumericControl?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHidInputReport> {
    public override fun getValue() = ABI.makeIHidInputReport(pointer.getPointer(0))

    public fun setValue(value: IHidInputReport_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHidInputReport {
    public val __1640404646_Ptr: Pointer?

    public val _1640404646_VtblPtr: Pointer?
      get() = __1640404646_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): WinDef.USHORT {
      val fnPtr = _1640404646_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1640404646_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Data(): IBuffer? {
      val fnPtr = _1640404646_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1640404646_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ActivatedBooleanControls(): IVectorView<HidBooleanControl?>? {
      val fnPtr = _1640404646_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<HidBooleanControl?>>()
      val hr = fn.invokeHR(arrayOf(__1640404646_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<HidBooleanControl?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_TransitionedBooleanControls(): IVectorView<HidBooleanControl?>? {
      val fnPtr = _1640404646_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<HidBooleanControl?>>()
      val hr = fn.invokeHR(arrayOf(__1640404646_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<HidBooleanControl?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetBooleanControl(usagePage: WinDef.USHORT, usageId: WinDef.USHORT):
        HidBooleanControl? {
      val fnPtr = _1640404646_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HidBooleanControl>()
      val hr = fn.invokeHR(arrayOf(__1640404646_Ptr, usagePage, usageId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HidBooleanControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override
        fun GetBooleanControlByDescription(controlDescription: HidBooleanControlDescription?):
        HidBooleanControl? {
      val fnPtr = _1640404646_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HidBooleanControl>()
      val hr = fn.invokeHR(arrayOf(__1640404646_Ptr, marshalToNative(controlDescription), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HidBooleanControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetNumericControl(usagePage: WinDef.USHORT, usageId: WinDef.USHORT):
        HidNumericControl? {
      val fnPtr = _1640404646_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HidNumericControl>()
      val hr = fn.invokeHR(arrayOf(__1640404646_Ptr, usagePage, usageId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HidNumericControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override
        fun GetNumericControlByDescription(controlDescription: HidNumericControlDescription?):
        HidNumericControl? {
      val fnPtr = _1640404646_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HidNumericControl>()
      val hr = fn.invokeHR(arrayOf(__1640404646_Ptr, marshalToNative(controlDescription), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HidNumericControl>(result.getValue())
      return resultValue
    }
  }

  public class IHidInputReport_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1640404646_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHidInputReport, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c35d0e50f7e74e8db23ecabbe56b90e9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHidInputReport(ptr: Pointer?): WithDefault = IHidInputReport_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHidInputReport {
      val address = segment.toRawLongValue()
      return makeIHidInputReport(Pointer(address))
    }

    public override fun toNative(obj: IHidInputReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1640404646_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHidInputReport): Array<IHidInputReport?> = (elements as
        Array<IHidInputReport?>).castToImpl<IHidInputReport,IHidInputReport_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHidInputReport?> =
        arrayOfNulls<IHidInputReport_Impl>(size) as Array<IHidInputReport?>
  }
}
