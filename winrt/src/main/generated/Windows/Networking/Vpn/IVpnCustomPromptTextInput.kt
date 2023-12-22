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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVpnCustomPromptTextInput.ABI::class)
@Signature("{c9da9c75-913c-47d5-88ba-48fc48930235}")
@Guid("c9da9c75913c47d588ba48fc48930235")
@WinRTInterface("c9da9c75913c47d588ba48fc48930235")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnCustomPromptTextInput.ByReference::class)
public interface IVpnCustomPromptTextInput : NativeMapped, IWinRTInterface, IVpnCustomPromptElement
    {
  @InterfaceMethod(0)
  public fun put_PlaceholderText(value: String?): Unit

  @InterfaceMethod(1)
  public fun get_PlaceholderText(): String?

  @InterfaceMethod(2)
  public fun put_IsTextHidden(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_IsTextHidden(): Boolean

  @InterfaceMethod(4)
  public fun get_Text(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnCustomPromptTextInput> {
    public override fun getValue() = ABI.makeIVpnCustomPromptTextInput(pointer.getPointer(0))

    public fun setValue(value: IVpnCustomPromptTextInput_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnCustomPromptTextInput, IVpnCustomPromptElement.WithDefault {
    public val __895936632_Ptr: Pointer?

    public val _895936632_VtblPtr: Pointer?
      get() = __895936632_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_PlaceholderText(value: String?): Unit {
      val fnPtr = _895936632_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__895936632_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_PlaceholderText(): String? {
      val fnPtr = _895936632_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__895936632_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_IsTextHidden(value: Boolean): Unit {
      val fnPtr = _895936632_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__895936632_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_IsTextHidden(): Boolean {
      val fnPtr = _895936632_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__895936632_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_Text(): String? {
      val fnPtr = _895936632_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__895936632_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IVpnCustomPromptTextInput_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IVpnCustomPromptElement {
    public override val __104557463_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_895936632_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __895936632_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnCustomPromptTextInput, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c9da9c75913c47d588ba48fc48930235")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnCustomPromptTextInput(ptr: Pointer?): WithDefault =
        IVpnCustomPromptTextInput_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnCustomPromptTextInput {
      val address = segment.toRawLongValue()
      return makeIVpnCustomPromptTextInput(Pointer(address))
    }

    public override fun toNative(obj: IVpnCustomPromptTextInput): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__895936632_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnCustomPromptTextInput):
        Array<IVpnCustomPromptTextInput?> = (elements as
        Array<IVpnCustomPromptTextInput?>).castToImpl<IVpnCustomPromptTextInput,IVpnCustomPromptTextInput_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnCustomPromptTextInput?> =
        arrayOfNulls<IVpnCustomPromptTextInput_Impl>(size) as Array<IVpnCustomPromptTextInput?>
  }
}
