package Windows.Management

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMdmAlert.ABI::class)
@Signature("{b0fbc327-28c1-4b52-a548-c5807caf70b6}")
@Guid("b0fbc32728c14b52a548c5807caf70b6")
@WinRTInterface("b0fbc32728c14b52a548c5807caf70b6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMdmAlert.ByReference::class)
public interface IMdmAlert : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Data(): String?

  @InterfaceMethod(1)
  public fun put_Data(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Format(): MdmAlertDataType?

  @InterfaceMethod(3)
  public fun put_Format(value: MdmAlertDataType?): Unit

  @InterfaceMethod(4)
  public fun get_Mark(): MdmAlertMark?

  @InterfaceMethod(5)
  public fun put_Mark(value: MdmAlertMark?): Unit

  @InterfaceMethod(6)
  public fun get_Source(): String?

  @InterfaceMethod(7)
  public fun put_Source(value: String?): Unit

  @InterfaceMethod(8)
  public fun get_Status(): WinDef.UINT

  @InterfaceMethod(9)
  public fun get_Target(): String?

  @InterfaceMethod(10)
  public fun put_Target(value: String?): Unit

  @InterfaceMethod(11)
  public fun get_Type(): String?

  @InterfaceMethod(12)
  public fun put_Type(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMdmAlert> {
    public override fun getValue() = ABI.makeIMdmAlert(pointer.getPointer(0))

    public fun setValue(value: IMdmAlert_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMdmAlert {
    public val __1651751841_Ptr: Pointer?

    public val _1651751841_VtblPtr: Pointer?
      get() = __1651751841_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Data(): String? {
      val fnPtr = _1651751841_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1651751841_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Data(value: String?): Unit {
      val fnPtr = _1651751841_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1651751841_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Format(): MdmAlertDataType? {
      val fnPtr = _1651751841_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MdmAlertDataType>()
      val hr = fn.invokeHR(arrayOf(__1651751841_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MdmAlertDataType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Format(value: MdmAlertDataType?): Unit {
      val fnPtr = _1651751841_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1651751841_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Mark(): MdmAlertMark? {
      val fnPtr = _1651751841_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MdmAlertMark>()
      val hr = fn.invokeHR(arrayOf(__1651751841_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MdmAlertMark>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Mark(value: MdmAlertMark?): Unit {
      val fnPtr = _1651751841_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1651751841_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Source(): String? {
      val fnPtr = _1651751841_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1651751841_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Source(value: String?): Unit {
      val fnPtr = _1651751841_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1651751841_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Status(): WinDef.UINT {
      val fnPtr = _1651751841_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1651751841_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_Target(): String? {
      val fnPtr = _1651751841_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1651751841_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_Target(value: String?): Unit {
      val fnPtr = _1651751841_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1651751841_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_Type(): String? {
      val fnPtr = _1651751841_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1651751841_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun put_Type(value: String?): Unit {
      val fnPtr = _1651751841_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1651751841_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMdmAlert_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1651751841_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMdmAlert, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b0fbc32728c14b52a548c5807caf70b6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMdmAlert(ptr: Pointer?): WithDefault = IMdmAlert_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMdmAlert {
      val address = segment.toRawLongValue()
      return makeIMdmAlert(Pointer(address))
    }

    public override fun toNative(obj: IMdmAlert): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1651751841_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMdmAlert): Array<IMdmAlert?> = (elements as
        Array<IMdmAlert?>).castToImpl<IMdmAlert,IMdmAlert_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMdmAlert?> = arrayOfNulls<IMdmAlert_Impl>(size)
        as Array<IMdmAlert?>
  }
}
