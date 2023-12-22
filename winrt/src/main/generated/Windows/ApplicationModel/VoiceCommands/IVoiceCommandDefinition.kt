package Windows.ApplicationModel.VoiceCommands

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.IAsyncAction
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

@ABIMarker(IVoiceCommandDefinition.ABI::class)
@Signature("{7972aad0-0974-4979-984b-cb8959cd61ae}")
@Guid("7972aad009744979984bcb8959cd61ae")
@WinRTInterface("7972aad009744979984bcb8959cd61ae")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVoiceCommandDefinition.ByReference::class)
public interface IVoiceCommandDefinition : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Language(): String?

  @InterfaceMethod(1)
  public fun get_Name(): String?

  @InterfaceMethod(2)
  public fun SetPhraseListAsync(phraseListName: String?, phraseList: IIterable<String?>?):
      IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVoiceCommandDefinition> {
    public override fun getValue() = ABI.makeIVoiceCommandDefinition(pointer.getPointer(0))

    public fun setValue(value: IVoiceCommandDefinition_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVoiceCommandDefinition {
    public val __1928620987_Ptr: Pointer?

    public val _1928620987_VtblPtr: Pointer?
      get() = __1928620987_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Language(): String? {
      val fnPtr = _1928620987_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1928620987_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Name(): String? {
      val fnPtr = _1928620987_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1928620987_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetPhraseListAsync(phraseListName: String?,
        phraseList: IIterable<String?>?): IAsyncAction? {
      val fnPtr = _1928620987_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1928620987_Ptr, marshalToNative(phraseListName),
          marshalToNative(phraseList), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IVoiceCommandDefinition_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1928620987_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVoiceCommandDefinition, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7972aad009744979984bcb8959cd61ae")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVoiceCommandDefinition(ptr: Pointer?): WithDefault =
        IVoiceCommandDefinition_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVoiceCommandDefinition {
      val address = segment.toRawLongValue()
      return makeIVoiceCommandDefinition(Pointer(address))
    }

    public override fun toNative(obj: IVoiceCommandDefinition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1928620987_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVoiceCommandDefinition): Array<IVoiceCommandDefinition?>
        = (elements as
        Array<IVoiceCommandDefinition?>).castToImpl<IVoiceCommandDefinition,IVoiceCommandDefinition_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVoiceCommandDefinition?> =
        arrayOfNulls<IVoiceCommandDefinition_Impl>(size) as Array<IVoiceCommandDefinition?>
  }
}
