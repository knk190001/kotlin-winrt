package Windows.Media.Playback

import Windows.Foundation.TimeSpan
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

@ABIMarker(IMediaBreakFactory.ABI::class)
@Signature("{4516e002-18e0-4079-8b5f-d33495c15d2e}")
@Guid("4516e00218e040798b5fd33495c15d2e")
@WinRTInterface("4516e00218e040798b5fd33495c15d2e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaBreakFactory.ByReference::class)
public interface IMediaBreakFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(insertionMethod: MediaBreakInsertionMethod?): MediaBreak?

  @InterfaceMethod(1)
  public fun CreateWithPresentationPosition(insertionMethod: MediaBreakInsertionMethod?,
      presentationPosition: TimeSpan?): MediaBreak?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaBreakFactory> {
    public override fun getValue() = ABI.makeIMediaBreakFactory(pointer.getPointer(0))

    public fun setValue(value: IMediaBreakFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaBreakFactory {
    public val __1389272022_Ptr: Pointer?

    public val _1389272022_VtblPtr: Pointer?
      get() = __1389272022_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(insertionMethod: MediaBreakInsertionMethod?): MediaBreak? {
      val fnPtr = _1389272022_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaBreak>()
      val hr = fn.invokeHR(arrayOf(__1389272022_Ptr, marshalToNative(insertionMethod), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaBreak>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithPresentationPosition(insertionMethod: MediaBreakInsertionMethod?,
        presentationPosition: TimeSpan?): MediaBreak? {
      val fnPtr = _1389272022_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaBreak>()
      val hr = fn.invokeHR(arrayOf(__1389272022_Ptr, marshalToNative(insertionMethod),
          marshalToNative(presentationPosition), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaBreak>(result.getValue())
      return resultValue
    }
  }

  public class IMediaBreakFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1389272022_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaBreakFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4516e00218e040798b5fd33495c15d2e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaBreakFactory(ptr: Pointer?): WithDefault = IMediaBreakFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaBreakFactory {
      val address = segment.toRawLongValue()
      return makeIMediaBreakFactory(Pointer(address))
    }

    public override fun toNative(obj: IMediaBreakFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1389272022_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaBreakFactory): Array<IMediaBreakFactory?> =
        (elements as
        Array<IMediaBreakFactory?>).castToImpl<IMediaBreakFactory,IMediaBreakFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaBreakFactory?> =
        arrayOfNulls<IMediaBreakFactory_Impl>(size) as Array<IMediaBreakFactory?>
  }
}
