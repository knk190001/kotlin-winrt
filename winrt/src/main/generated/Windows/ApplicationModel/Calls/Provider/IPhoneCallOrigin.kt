package Windows.ApplicationModel.Calls.Provider

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

@ABIMarker(IPhoneCallOrigin.ABI::class)
@Signature("{20613479-0ef9-4454-871c-afb66a14b6a5}")
@Guid("206134790ef94454871cafb66a14b6a5")
@WinRTInterface("206134790ef94454871cafb66a14b6a5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneCallOrigin.ByReference::class)
public interface IPhoneCallOrigin : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Category(): String?

  @InterfaceMethod(1)
  public fun put_Category(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_CategoryDescription(): String?

  @InterfaceMethod(3)
  public fun put_CategoryDescription(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_Location(): String?

  @InterfaceMethod(5)
  public fun put_Location(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneCallOrigin> {
    public override fun getValue() = ABI.makeIPhoneCallOrigin(pointer.getPointer(0))

    public fun setValue(value: IPhoneCallOrigin_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneCallOrigin {
    public val __1700495613_Ptr: Pointer?

    public val _1700495613_VtblPtr: Pointer?
      get() = __1700495613_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Category(): String? {
      val fnPtr = _1700495613_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1700495613_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Category(value: String?): Unit {
      val fnPtr = _1700495613_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1700495613_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CategoryDescription(): String? {
      val fnPtr = _1700495613_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1700495613_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_CategoryDescription(value: String?): Unit {
      val fnPtr = _1700495613_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1700495613_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Location(): String? {
      val fnPtr = _1700495613_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1700495613_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Location(value: String?): Unit {
      val fnPtr = _1700495613_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1700495613_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPhoneCallOrigin_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1700495613_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneCallOrigin, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("206134790ef94454871cafb66a14b6a5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneCallOrigin(ptr: Pointer?): WithDefault = IPhoneCallOrigin_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneCallOrigin {
      val address = segment.toRawLongValue()
      return makeIPhoneCallOrigin(Pointer(address))
    }

    public override fun toNative(obj: IPhoneCallOrigin): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1700495613_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneCallOrigin): Array<IPhoneCallOrigin?> = (elements as
        Array<IPhoneCallOrigin?>).castToImpl<IPhoneCallOrigin,IPhoneCallOrigin_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneCallOrigin?> =
        arrayOfNulls<IPhoneCallOrigin_Impl>(size) as Array<IPhoneCallOrigin?>
  }
}
