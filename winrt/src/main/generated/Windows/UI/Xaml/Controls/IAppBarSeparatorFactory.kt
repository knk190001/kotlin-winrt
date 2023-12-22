package Windows.UI.Xaml.Controls

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

@ABIMarker(IAppBarSeparatorFactory.ABI::class)
@Signature("{05da25cd-f407-48de-8b50-ff87d1e2818f}")
@Guid("05da25cdf40748de8b50ff87d1e2818f")
@WinRTInterface("05da25cdf40748de8b50ff87d1e2818f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBarSeparatorFactory.ByReference::class)
public interface IAppBarSeparatorFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): AppBarSeparator?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBarSeparatorFactory> {
    public override fun getValue() = ABI.makeIAppBarSeparatorFactory(pointer.getPointer(0))

    public fun setValue(value: IAppBarSeparatorFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBarSeparatorFactory {
    public val __1281741779_Ptr: Pointer?

    public val _1281741779_VtblPtr: Pointer?
      get() = __1281741779_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        AppBarSeparator? {
      val fnPtr = _1281741779_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBarSeparator>()
      val hr = fn.invokeHR(arrayOf(__1281741779_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBarSeparator>(result.getValue())
      return resultValue
    }
  }

  public class IAppBarSeparatorFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1281741779_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBarSeparatorFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("05da25cdf40748de8b50ff87d1e2818f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBarSeparatorFactory(ptr: Pointer?): WithDefault =
        IAppBarSeparatorFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBarSeparatorFactory {
      val address = segment.toRawLongValue()
      return makeIAppBarSeparatorFactory(Pointer(address))
    }

    public override fun toNative(obj: IAppBarSeparatorFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1281741779_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBarSeparatorFactory): Array<IAppBarSeparatorFactory?>
        = (elements as
        Array<IAppBarSeparatorFactory?>).castToImpl<IAppBarSeparatorFactory,IAppBarSeparatorFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBarSeparatorFactory?> =
        arrayOfNulls<IAppBarSeparatorFactory_Impl>(size) as Array<IAppBarSeparatorFactory?>
  }
}
