package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IAnimatedIconSourceFactory.ABI::class)
@Signature("{ae8fb7de-7ec2-5ae2-b461-bead570420fa}")
@Guid("ae8fb7de7ec25ae2b461bead570420fa")
@WinRTInterface("ae8fb7de7ec25ae2b461bead570420fa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAnimatedIconSourceFactory.ByReference::class)
public interface IAnimatedIconSourceFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      AnimatedIconSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAnimatedIconSourceFactory> {
    public override fun getValue() = ABI.makeIAnimatedIconSourceFactory(pointer.getPointer(0))

    public fun setValue(value: IAnimatedIconSourceFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAnimatedIconSourceFactory {
    public val __1045331244_Ptr: Pointer?

    public val _1045331244_VtblPtr: Pointer?
      get() = __1045331244_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        AnimatedIconSource? {
      val fnPtr = _1045331244_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AnimatedIconSource>()
      val hr = fn.invokeHR(arrayOf(__1045331244_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AnimatedIconSource>(result.getValue())
      return resultValue
    }
  }

  public class IAnimatedIconSourceFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1045331244_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAnimatedIconSourceFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ae8fb7de7ec25ae2b461bead570420fa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAnimatedIconSourceFactory(ptr: Pointer?): WithDefault =
        IAnimatedIconSourceFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAnimatedIconSourceFactory {
      val address = segment.toRawLongValue()
      return makeIAnimatedIconSourceFactory(Pointer(address))
    }

    public override fun toNative(obj: IAnimatedIconSourceFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1045331244_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAnimatedIconSourceFactory):
        Array<IAnimatedIconSourceFactory?> = (elements as
        Array<IAnimatedIconSourceFactory?>).castToImpl<IAnimatedIconSourceFactory,IAnimatedIconSourceFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAnimatedIconSourceFactory?> =
        arrayOfNulls<IAnimatedIconSourceFactory_Impl>(size) as Array<IAnimatedIconSourceFactory?>
  }
}
