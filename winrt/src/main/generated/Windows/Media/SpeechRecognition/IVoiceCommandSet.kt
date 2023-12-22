package Windows.Media.SpeechRecognition

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

@ABIMarker(IVoiceCommandSet.ABI::class)
@Signature("{0bedda75-46e6-4b11-a088-5c68632899b5}")
@Guid("0bedda7546e64b11a0885c68632899b5")
@WinRTInterface("0bedda7546e64b11a0885c68632899b5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVoiceCommandSet.ByReference::class)
public interface IVoiceCommandSet : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Language(): String?

  @InterfaceMethod(1)
  public fun get_Name(): String?

  @InterfaceMethod(2)
  public fun SetPhraseListAsync(phraseListName: String?, phraseList: IIterable<String?>?):
      IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVoiceCommandSet> {
    public override fun getValue() = ABI.makeIVoiceCommandSet(pointer.getPointer(0))

    public fun setValue(value: IVoiceCommandSet_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVoiceCommandSet {
    public val __1092715392_Ptr: Pointer?

    public val _1092715392_VtblPtr: Pointer?
      get() = __1092715392_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Language(): String? {
      val fnPtr = _1092715392_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1092715392_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Name(): String? {
      val fnPtr = _1092715392_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1092715392_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetPhraseListAsync(phraseListName: String?,
        phraseList: IIterable<String?>?): IAsyncAction? {
      val fnPtr = _1092715392_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1092715392_Ptr, marshalToNative(phraseListName),
          marshalToNative(phraseList), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IVoiceCommandSet_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1092715392_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVoiceCommandSet, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0bedda7546e64b11a0885c68632899b5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVoiceCommandSet(ptr: Pointer?): WithDefault = IVoiceCommandSet_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVoiceCommandSet {
      val address = segment.toRawLongValue()
      return makeIVoiceCommandSet(Pointer(address))
    }

    public override fun toNative(obj: IVoiceCommandSet): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1092715392_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVoiceCommandSet): Array<IVoiceCommandSet?> = (elements as
        Array<IVoiceCommandSet?>).castToImpl<IVoiceCommandSet,IVoiceCommandSet_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVoiceCommandSet?> =
        arrayOfNulls<IVoiceCommandSet_Impl>(size) as Array<IVoiceCommandSet?>
  }
}
