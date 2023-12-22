package Windows.Devices.HumanInterfaceDevice

import Windows.Foundation.Collections.IVectorView
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHidNumericControlDescription.ABI::class)
@Signature("{638d5e86-1d97-4c75-927f-5ff58ba05e32}")
@Guid("638d5e861d974c75927f5ff58ba05e32")
@WinRTInterface("638d5e861d974c75927f5ff58ba05e32")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHidNumericControlDescription.ByReference::class)
public interface IHidNumericControlDescription : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_ReportId(): WinDef.USHORT

  @InterfaceMethod(2)
  public fun get_ReportType(): HidReportType?

  @InterfaceMethod(3)
  public fun get_ReportSize(): WinDef.UINT

  @InterfaceMethod(4)
  public fun get_ReportCount(): WinDef.UINT

  @InterfaceMethod(5)
  public fun get_UsagePage(): WinDef.USHORT

  @InterfaceMethod(6)
  public fun get_UsageId(): WinDef.USHORT

  @InterfaceMethod(7)
  public fun get_LogicalMinimum(): Int

  @InterfaceMethod(8)
  public fun get_LogicalMaximum(): Int

  @InterfaceMethod(9)
  public fun get_PhysicalMinimum(): Int

  @InterfaceMethod(10)
  public fun get_PhysicalMaximum(): Int

  @InterfaceMethod(11)
  public fun get_UnitExponent(): WinDef.UINT

  @InterfaceMethod(12)
  public fun get_Unit(): WinDef.UINT

  @InterfaceMethod(13)
  public fun get_IsAbsolute(): Boolean

  @InterfaceMethod(14)
  public fun get_HasNull(): Boolean

  @InterfaceMethod(15)
  public fun get_ParentCollections(): IVectorView<HidCollection?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHidNumericControlDescription> {
    public override fun getValue() = ABI.makeIHidNumericControlDescription(pointer.getPointer(0))

    public fun setValue(value: IHidNumericControlDescription_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHidNumericControlDescription {
    public val __404150100_Ptr: Pointer?

    public val _404150100_VtblPtr: Pointer?
      get() = __404150100_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): WinDef.UINT {
      val fnPtr = _404150100_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__404150100_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_ReportId(): WinDef.USHORT {
      val fnPtr = _404150100_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__404150100_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_ReportType(): HidReportType? {
      val fnPtr = _404150100_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HidReportType>()
      val hr = fn.invokeHR(arrayOf(__404150100_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HidReportType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ReportSize(): WinDef.UINT {
      val fnPtr = _404150100_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__404150100_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_ReportCount(): WinDef.UINT {
      val fnPtr = _404150100_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__404150100_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_UsagePage(): WinDef.USHORT {
      val fnPtr = _404150100_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__404150100_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_UsageId(): WinDef.USHORT {
      val fnPtr = _404150100_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__404150100_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_LogicalMinimum(): Int {
      val fnPtr = _404150100_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__404150100_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_LogicalMaximum(): Int {
      val fnPtr = _404150100_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__404150100_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_PhysicalMinimum(): Int {
      val fnPtr = _404150100_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__404150100_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun get_PhysicalMaximum(): Int {
      val fnPtr = _404150100_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__404150100_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun get_UnitExponent(): WinDef.UINT {
      val fnPtr = _404150100_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__404150100_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun get_Unit(): WinDef.UINT {
      val fnPtr = _404150100_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__404150100_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun get_IsAbsolute(): Boolean {
      val fnPtr = _404150100_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__404150100_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun get_HasNull(): Boolean {
      val fnPtr = _404150100_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__404150100_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun get_ParentCollections(): IVectorView<HidCollection?>? {
      val fnPtr = _404150100_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<HidCollection?>>()
      val hr = fn.invokeHR(arrayOf(__404150100_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<HidCollection?>>(result.getValue())
      return resultValue
    }
  }

  public class IHidNumericControlDescription_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __404150100_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHidNumericControlDescription, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("638d5e861d974c75927f5ff58ba05e32")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHidNumericControlDescription(ptr: Pointer?): WithDefault =
        IHidNumericControlDescription_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHidNumericControlDescription {
      val address = segment.toRawLongValue()
      return makeIHidNumericControlDescription(Pointer(address))
    }

    public override fun toNative(obj: IHidNumericControlDescription): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__404150100_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHidNumericControlDescription):
        Array<IHidNumericControlDescription?> = (elements as
        Array<IHidNumericControlDescription?>).castToImpl<IHidNumericControlDescription,IHidNumericControlDescription_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHidNumericControlDescription?> =
        arrayOfNulls<IHidNumericControlDescription_Impl>(size) as
        Array<IHidNumericControlDescription?>
  }
}
