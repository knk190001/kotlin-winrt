package Microsoft.UI.Xaml.Media.Animation

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(ITimelineFactory.ABI::class)
@Signature("{6a635732-a827-5398-9fc8-dfbc3b97e3c1}")
@Guid("6a635732a82753989fc8dfbc3b97e3c1")
@WinRTInterface("6a635732a82753989fc8dfbc3b97e3c1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimelineFactory.ByReference::class)
public interface ITimelineFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): Timeline?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimelineFactory> {
    public override fun getValue() = ABI.makeITimelineFactory(pointer.getPointer(0))

    public fun setValue(value: ITimelineFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimelineFactory {
    public val __1636406830_Ptr: Pointer?

    public val _1636406830_VtblPtr: Pointer?
      get() = __1636406830_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        Timeline? {
      val fnPtr = _1636406830_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Timeline>()
      val hr = fn.invokeHR(arrayOf(__1636406830_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Timeline>(result.getValue())
      return resultValue
    }
  }

  public class ITimelineFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1636406830_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimelineFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6a635732a82753989fc8dfbc3b97e3c1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimelineFactory(ptr: Pointer?): WithDefault = ITimelineFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimelineFactory {
      val address = segment.toRawLongValue()
      return makeITimelineFactory(Pointer(address))
    }

    public override fun toNative(obj: ITimelineFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1636406830_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimelineFactory): Array<ITimelineFactory?> = (elements as
        Array<ITimelineFactory?>).castToImpl<ITimelineFactory,ITimelineFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimelineFactory?> =
        arrayOfNulls<ITimelineFactory_Impl>(size) as Array<ITimelineFactory?>
  }
}
