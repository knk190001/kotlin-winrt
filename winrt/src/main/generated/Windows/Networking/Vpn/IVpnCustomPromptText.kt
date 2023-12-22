package Windows.Networking.Vpn

import Windows.Networking.Vpn.IVpnCustomPromptElement.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVpnCustomPromptText.ABI::class)
@Signature("{3bc8bdee-3a42-49a3-abdd-07b2edea752d}")
@Guid("3bc8bdee3a4249a3abdd07b2edea752d")
@WinRTInterface("3bc8bdee3a4249a3abdd07b2edea752d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnCustomPromptText.ByReference::class)
public interface IVpnCustomPromptText : NativeMapped, IWinRTInterface, IVpnCustomPromptElement {
  @InterfaceMethod(0)
  public fun put_Text(value: String?): Unit

  @InterfaceMethod(1)
  public fun get_Text(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnCustomPromptText> {
    public override fun getValue() = ABI.makeIVpnCustomPromptText(pointer.getPointer(0))

    public fun setValue(value: IVpnCustomPromptText_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnCustomPromptText, IVpnCustomPromptElement.WithDefault {
    public val __272348786_Ptr: Pointer?

    public val _272348786_VtblPtr: Pointer?
      get() = __272348786_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Text(value: String?): Unit {
      val fnPtr = _272348786_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__272348786_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Text(): String? {
      val fnPtr = _272348786_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__272348786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IVpnCustomPromptText_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IVpnCustomPromptElement {
    public override val __104557463_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_272348786_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __272348786_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnCustomPromptText, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3bc8bdee3a4249a3abdd07b2edea752d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnCustomPromptText(ptr: Pointer?): WithDefault = IVpnCustomPromptText_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnCustomPromptText {
      val address = segment.toRawLongValue()
      return makeIVpnCustomPromptText(Pointer(address))
    }

    public override fun toNative(obj: IVpnCustomPromptText): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__272348786_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnCustomPromptText): Array<IVpnCustomPromptText?> =
        (elements as
        Array<IVpnCustomPromptText?>).castToImpl<IVpnCustomPromptText,IVpnCustomPromptText_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnCustomPromptText?> =
        arrayOfNulls<IVpnCustomPromptText_Impl>(size) as Array<IVpnCustomPromptText?>
  }
}
