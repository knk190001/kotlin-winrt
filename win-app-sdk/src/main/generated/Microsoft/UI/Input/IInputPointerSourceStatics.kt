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

@ABIMarker(IInputPointerSourceStatics.ABI::class)
@Signature("{e8a19fd1-a914-533f-9b0f-6bf0065e6781}")
@Guid("e8a19fd1a914533f9b0f6bf0065e6781")
@WinRTInterface("e8a19fd1a914533f9b0f6bf0065e6781")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputPointerSourceStatics.ByReference::class)
public interface IInputPointerSourceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForIsland(island: ContentIsland?): InputPointerSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputPointerSourceStatics> {
    public override fun getValue() = ABI.makeIInputPointerSourceStatics(pointer.getPointer(0))

    public fun setValue(value: IInputPointerSourceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputPointerSourceStatics {
    public val __1779366782_Ptr: Pointer?

    public val _1779366782_VtblPtr: Pointer?
      get() = __1779366782_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForIsland(island: ContentIsland?): InputPointerSource? {
      val fnPtr = _1779366782_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InputPointerSource>()
      val hr = fn.invokeHR(arrayOf(__1779366782_Ptr, marshalToNative(island), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InputPointerSource>(result.getValue())
      return resultValue
    }
  }

  public class IInputPointerSourceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1779366782_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputPointerSourceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e8a19fd1a914533f9b0f6bf0065e6781")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputPointerSourceStatics(ptr: Pointer?): WithDefault =
        IInputPointerSourceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputPointerSourceStatics {
      val address = segment.toRawLongValue()
      return makeIInputPointerSourceStatics(Pointer(address))
    }

    public override fun toNative(obj: IInputPointerSourceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1779366782_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputPointerSourceStatics):
        Array<IInputPointerSourceStatics?> = (elements as
        Array<IInputPointerSourceStatics?>).castToImpl<IInputPointerSourceStatics,IInputPointerSourceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputPointerSourceStatics?> =
        arrayOfNulls<IInputPointerSourceStatics_Impl>(size) as Array<IInputPointerSourceStatics?>
  }
}
