package Windows.Networking.Vpn

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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVpnCustomPrompt.ABI::class)
@Signature("{9b2ebe7b-87d5-433c-b4f6-eee6aa68a244}")
@Guid("9b2ebe7b87d5433cb4f6eee6aa68a244")
@WinRTInterface("9b2ebe7b87d5433cb4f6eee6aa68a244")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnCustomPrompt.ByReference::class)
public interface IVpnCustomPrompt : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_Label(value: String?): Unit

  @InterfaceMethod(1)
  public fun get_Label(): String?

  @InterfaceMethod(2)
  public fun put_Compulsory(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_Compulsory(): Boolean

  @InterfaceMethod(4)
  public fun put_Bordered(value: Boolean): Unit

  @InterfaceMethod(5)
  public fun get_Bordered(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnCustomPrompt> {
    public override fun getValue() = ABI.makeIVpnCustomPrompt(pointer.getPointer(0))

    public fun setValue(value: IVpnCustomPrompt_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnCustomPrompt {
    public val __235034533_Ptr: Pointer?

    public val _235034533_VtblPtr: Pointer?
      get() = __235034533_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Label(value: String?): Unit {
      val fnPtr = _235034533_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__235034533_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Label(): String? {
      val fnPtr = _235034533_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__235034533_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Compulsory(value: Boolean): Unit {
      val fnPtr = _235034533_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__235034533_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Compulsory(): Boolean {
      val fnPtr = _235034533_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__235034533_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_Bordered(value: Boolean): Unit {
      val fnPtr = _235034533_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__235034533_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_Bordered(): Boolean {
      val fnPtr = _235034533_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__235034533_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IVpnCustomPrompt_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __235034533_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnCustomPrompt, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9b2ebe7b87d5433cb4f6eee6aa68a244")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnCustomPrompt(ptr: Pointer?): WithDefault = IVpnCustomPrompt_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnCustomPrompt {
      val address = segment.toRawLongValue()
      return makeIVpnCustomPrompt(Pointer(address))
    }

    public override fun toNative(obj: IVpnCustomPrompt): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__235034533_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnCustomPrompt): Array<IVpnCustomPrompt?> = (elements as
        Array<IVpnCustomPrompt?>).castToImpl<IVpnCustomPrompt,IVpnCustomPrompt_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnCustomPrompt?> =
        arrayOfNulls<IVpnCustomPrompt_Impl>(size) as Array<IVpnCustomPrompt?>
  }
}
