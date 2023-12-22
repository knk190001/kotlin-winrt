package Windows.ApplicationModel.Email

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

@ABIMarker(IEmailRecipient.ABI::class)
@Signature("{cae825b3-4478-4814-b900-c902b5e19b53}")
@Guid("cae825b344784814b900c902b5e19b53")
@WinRTInterface("cae825b344784814b900c902b5e19b53")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailRecipient.ByReference::class)
public interface IEmailRecipient : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun put_Name(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Address(): String?

  @InterfaceMethod(3)
  public fun put_Address(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailRecipient> {
    public override fun getValue() = ABI.makeIEmailRecipient(pointer.getPointer(0))

    public fun setValue(value: IEmailRecipient_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailRecipient {
    public val __1557134132_Ptr: Pointer?

    public val _1557134132_VtblPtr: Pointer?
      get() = __1557134132_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _1557134132_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1557134132_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Name(value: String?): Unit {
      val fnPtr = _1557134132_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1557134132_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Address(): String? {
      val fnPtr = _1557134132_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1557134132_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Address(value: String?): Unit {
      val fnPtr = _1557134132_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1557134132_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IEmailRecipient_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1557134132_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailRecipient, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cae825b344784814b900c902b5e19b53")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailRecipient(ptr: Pointer?): WithDefault = IEmailRecipient_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailRecipient {
      val address = segment.toRawLongValue()
      return makeIEmailRecipient(Pointer(address))
    }

    public override fun toNative(obj: IEmailRecipient): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1557134132_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailRecipient): Array<IEmailRecipient?> = (elements as
        Array<IEmailRecipient?>).castToImpl<IEmailRecipient,IEmailRecipient_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailRecipient?> =
        arrayOfNulls<IEmailRecipient_Impl>(size) as Array<IEmailRecipient?>
  }
}
