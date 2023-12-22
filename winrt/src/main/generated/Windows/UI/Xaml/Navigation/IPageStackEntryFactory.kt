package Windows.UI.Xaml.Navigation

import Windows.UI.Xaml.Interop.TypeName
import Windows.UI.Xaml.Media.Animation.NavigationTransitionInfo
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

@ABIMarker(IPageStackEntryFactory.ABI::class)
@Signature("{4454048a-a8b9-4f78-9b84-1f51f58851ff}")
@Guid("4454048aa8b94f789b841f51f58851ff")
@WinRTInterface("4454048aa8b94f789b841f51f58851ff")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPageStackEntryFactory.ByReference::class)
public interface IPageStackEntryFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(
    sourcePageType: TypeName?,
    parameter: IUnknown?,
    navigationTransitionInfo: NavigationTransitionInfo?
  ): PageStackEntry?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPageStackEntryFactory> {
    public override fun getValue() = ABI.makeIPageStackEntryFactory(pointer.getPointer(0))

    public fun setValue(value: IPageStackEntryFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPageStackEntryFactory {
    public val __1635981165_Ptr: Pointer?

    public val _1635981165_VtblPtr: Pointer?
      get() = __1635981165_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(
      sourcePageType: TypeName?,
      parameter: IUnknown?,
      navigationTransitionInfo: NavigationTransitionInfo?
    ): PageStackEntry? {
      val fnPtr = _1635981165_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PageStackEntry>()
      val hr = fn.invokeHR(arrayOf(__1635981165_Ptr, marshalToNative(sourcePageType),
          marshalToNative(parameter), marshalToNative(navigationTransitionInfo), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PageStackEntry>(result.getValue())
      return resultValue
    }
  }

  public class IPageStackEntryFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1635981165_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPageStackEntryFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4454048aa8b94f789b841f51f58851ff")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPageStackEntryFactory(ptr: Pointer?): WithDefault =
        IPageStackEntryFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPageStackEntryFactory {
      val address = segment.toRawLongValue()
      return makeIPageStackEntryFactory(Pointer(address))
    }

    public override fun toNative(obj: IPageStackEntryFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1635981165_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPageStackEntryFactory): Array<IPageStackEntryFactory?> =
        (elements as
        Array<IPageStackEntryFactory?>).castToImpl<IPageStackEntryFactory,IPageStackEntryFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPageStackEntryFactory?> =
        arrayOfNulls<IPageStackEntryFactory_Impl>(size) as Array<IPageStackEntryFactory?>
  }
}
