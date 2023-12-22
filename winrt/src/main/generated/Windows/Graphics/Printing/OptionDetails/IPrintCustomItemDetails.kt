package Windows.Graphics.Printing.OptionDetails

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

@ABIMarker(IPrintCustomItemDetails.ABI::class)
@Signature("{5704b637-5c3a-449a-aa36-b3291b1192fd}")
@Guid("5704b6375c3a449aaa36b3291b1192fd")
@WinRTInterface("5704b6375c3a449aaa36b3291b1192fd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintCustomItemDetails.ByReference::class)
public interface IPrintCustomItemDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ItemId(): String?

  @InterfaceMethod(1)
  public fun put_ItemDisplayName(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_ItemDisplayName(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintCustomItemDetails> {
    public override fun getValue() = ABI.makeIPrintCustomItemDetails(pointer.getPointer(0))

    public fun setValue(value: IPrintCustomItemDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintCustomItemDetails {
    public val __1752146066_Ptr: Pointer?

    public val _1752146066_VtblPtr: Pointer?
      get() = __1752146066_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ItemId(): String? {
      val fnPtr = _1752146066_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1752146066_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ItemDisplayName(value: String?): Unit {
      val fnPtr = _1752146066_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1752146066_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ItemDisplayName(): String? {
      val fnPtr = _1752146066_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1752146066_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IPrintCustomItemDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1752146066_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintCustomItemDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5704b6375c3a449aaa36b3291b1192fd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintCustomItemDetails(ptr: Pointer?): WithDefault =
        IPrintCustomItemDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintCustomItemDetails {
      val address = segment.toRawLongValue()
      return makeIPrintCustomItemDetails(Pointer(address))
    }

    public override fun toNative(obj: IPrintCustomItemDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1752146066_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintCustomItemDetails): Array<IPrintCustomItemDetails?>
        = (elements as
        Array<IPrintCustomItemDetails?>).castToImpl<IPrintCustomItemDetails,IPrintCustomItemDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintCustomItemDetails?> =
        arrayOfNulls<IPrintCustomItemDetails_Impl>(size) as Array<IPrintCustomItemDetails?>
  }
}
