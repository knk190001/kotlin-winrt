package Windows.UI.Xaml.Media.Animation

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

@ABIMarker(IBeginStoryboard.ABI::class)
@Signature("{64189fcd-49ec-4e52-a6f6-55324c921053}")
@Guid("64189fcd49ec4e52a6f655324c921053")
@WinRTInterface("64189fcd49ec4e52a6f655324c921053")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBeginStoryboard.ByReference::class)
public interface IBeginStoryboard : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Storyboard(): Storyboard?

  @InterfaceMethod(1)
  public fun put_Storyboard(value: Storyboard?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBeginStoryboard> {
    public override fun getValue() = ABI.makeIBeginStoryboard(pointer.getPointer(0))

    public fun setValue(value: IBeginStoryboard_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBeginStoryboard {
    public val __1474251220_Ptr: Pointer?

    public val _1474251220_VtblPtr: Pointer?
      get() = __1474251220_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Storyboard(): Storyboard? {
      val fnPtr = _1474251220_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Storyboard>()
      val hr = fn.invokeHR(arrayOf(__1474251220_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Storyboard>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Storyboard(value: Storyboard?): Unit {
      val fnPtr = _1474251220_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1474251220_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBeginStoryboard_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1474251220_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBeginStoryboard, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("64189fcd49ec4e52a6f655324c921053")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBeginStoryboard(ptr: Pointer?): WithDefault = IBeginStoryboard_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBeginStoryboard {
      val address = segment.toRawLongValue()
      return makeIBeginStoryboard(Pointer(address))
    }

    public override fun toNative(obj: IBeginStoryboard): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1474251220_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBeginStoryboard): Array<IBeginStoryboard?> = (elements as
        Array<IBeginStoryboard?>).castToImpl<IBeginStoryboard,IBeginStoryboard_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBeginStoryboard?> =
        arrayOfNulls<IBeginStoryboard_Impl>(size) as Array<IBeginStoryboard?>
  }
}
