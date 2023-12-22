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

@ABIMarker(IAnimatedIconFactory.ABI::class)
@Signature("{3356e0d1-d82f-5fc1-8165-9b9d1b9d9514}")
@Guid("3356e0d1d82f5fc181659b9d1b9d9514")
@WinRTInterface("3356e0d1d82f5fc181659b9d1b9d9514")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAnimatedIconFactory.ByReference::class)
public interface IAnimatedIconFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): AnimatedIcon?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAnimatedIconFactory> {
    public override fun getValue() = ABI.makeIAnimatedIconFactory(pointer.getPointer(0))

    public fun setValue(value: IAnimatedIconFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAnimatedIconFactory {
    public val __1514265721_Ptr: Pointer?

    public val _1514265721_VtblPtr: Pointer?
      get() = __1514265721_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        AnimatedIcon? {
      val fnPtr = _1514265721_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AnimatedIcon>()
      val hr = fn.invokeHR(arrayOf(__1514265721_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AnimatedIcon>(result.getValue())
      return resultValue
    }
  }

  public class IAnimatedIconFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1514265721_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAnimatedIconFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3356e0d1d82f5fc181659b9d1b9d9514")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAnimatedIconFactory(ptr: Pointer?): WithDefault = IAnimatedIconFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAnimatedIconFactory {
      val address = segment.toRawLongValue()
      return makeIAnimatedIconFactory(Pointer(address))
    }

    public override fun toNative(obj: IAnimatedIconFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1514265721_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAnimatedIconFactory): Array<IAnimatedIconFactory?> =
        (elements as
        Array<IAnimatedIconFactory?>).castToImpl<IAnimatedIconFactory,IAnimatedIconFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAnimatedIconFactory?> =
        arrayOfNulls<IAnimatedIconFactory_Impl>(size) as Array<IAnimatedIconFactory?>
  }
}
