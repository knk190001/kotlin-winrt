package Microsoft.UI.Input

import Microsoft.UI.Content.ContentIsland
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInputPreTranslateKeyboardSourceStatics.ABI::class)
@Signature("{23d584d2-af8c-5a8a-806f-2ba9c5b1a5ec}")
@Guid("23d584d2af8c5a8a806f2ba9c5b1a5ec")
@WinRTInterface("23d584d2af8c5a8a806f2ba9c5b1a5ec")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputPreTranslateKeyboardSourceStatics.ByReference::class)
public interface IInputPreTranslateKeyboardSourceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForIsland(island: ContentIsland?): InputPreTranslateKeyboardSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputPreTranslateKeyboardSourceStatics> {
    public override fun getValue() =
        ABI.makeIInputPreTranslateKeyboardSourceStatics(pointer.getPointer(0))

    public fun setValue(value: IInputPreTranslateKeyboardSourceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputPreTranslateKeyboardSourceStatics {
    public val __1268207975_Ptr: Pointer?

    public val _1268207975_VtblPtr: Pointer?
      get() = __1268207975_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForIsland(island: ContentIsland?): InputPreTranslateKeyboardSource? {
      val fnPtr = _1268207975_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InputPreTranslateKeyboardSource>()
      val hr = fn.invokeHR(arrayOf(__1268207975_Ptr, marshalToNative(island), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InputPreTranslateKeyboardSource>(result.getValue())
      return resultValue
    }
  }

  public class IInputPreTranslateKeyboardSourceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1268207975_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputPreTranslateKeyboardSourceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("23d584d2af8c5a8a806f2ba9c5b1a5ec")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputPreTranslateKeyboardSourceStatics(ptr: Pointer?): WithDefault =
        IInputPreTranslateKeyboardSourceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IInputPreTranslateKeyboardSourceStatics {
      val address = segment.toRawLongValue()
      return makeIInputPreTranslateKeyboardSourceStatics(Pointer(address))
    }

    public override fun toNative(obj: IInputPreTranslateKeyboardSourceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1268207975_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputPreTranslateKeyboardSourceStatics):
        Array<IInputPreTranslateKeyboardSourceStatics?> = (elements as
        Array<IInputPreTranslateKeyboardSourceStatics?>).castToImpl<IInputPreTranslateKeyboardSourceStatics,IInputPreTranslateKeyboardSourceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputPreTranslateKeyboardSourceStatics?> =
        arrayOfNulls<IInputPreTranslateKeyboardSourceStatics_Impl>(size) as
        Array<IInputPreTranslateKeyboardSourceStatics?>
  }
}
