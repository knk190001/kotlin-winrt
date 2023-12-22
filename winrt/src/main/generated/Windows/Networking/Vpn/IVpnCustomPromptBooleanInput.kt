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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVpnCustomPromptBooleanInput.ABI::class)
@Signature("{c4c9a69e-ff47-4527-9f27-a49292019979}")
@Guid("c4c9a69eff4745279f27a49292019979")
@WinRTInterface("c4c9a69eff4745279f27a49292019979")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnCustomPromptBooleanInput.ByReference::class)
public interface IVpnCustomPromptBooleanInput : NativeMapped, IWinRTInterface,
    IVpnCustomPromptElement {
  @InterfaceMethod(0)
  public fun put_InitialValue(value: Boolean): Unit

  @InterfaceMethod(1)
  public fun get_InitialValue(): Boolean

  @InterfaceMethod(2)
  public fun get_Value(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnCustomPromptBooleanInput> {
    public override fun getValue() = ABI.makeIVpnCustomPromptBooleanInput(pointer.getPointer(0))

    public fun setValue(value: IVpnCustomPromptBooleanInput_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnCustomPromptBooleanInput, IVpnCustomPromptElement.WithDefault {
    public val __660123847_Ptr: Pointer?

    public val _660123847_VtblPtr: Pointer?
      get() = __660123847_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_InitialValue(value: Boolean): Unit {
      val fnPtr = _660123847_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__660123847_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_InitialValue(): Boolean {
      val fnPtr = _660123847_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__660123847_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Value(): Boolean {
      val fnPtr = _660123847_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__660123847_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IVpnCustomPromptBooleanInput_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IVpnCustomPromptElement {
    public override val __104557463_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_660123847_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __660123847_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnCustomPromptBooleanInput, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c4c9a69eff4745279f27a49292019979")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnCustomPromptBooleanInput(ptr: Pointer?): WithDefault =
        IVpnCustomPromptBooleanInput_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnCustomPromptBooleanInput {
      val address = segment.toRawLongValue()
      return makeIVpnCustomPromptBooleanInput(Pointer(address))
    }

    public override fun toNative(obj: IVpnCustomPromptBooleanInput): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__660123847_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnCustomPromptBooleanInput):
        Array<IVpnCustomPromptBooleanInput?> = (elements as
        Array<IVpnCustomPromptBooleanInput?>).castToImpl<IVpnCustomPromptBooleanInput,IVpnCustomPromptBooleanInput_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnCustomPromptBooleanInput?> =
        arrayOfNulls<IVpnCustomPromptBooleanInput_Impl>(size) as
        Array<IVpnCustomPromptBooleanInput?>
  }
}
