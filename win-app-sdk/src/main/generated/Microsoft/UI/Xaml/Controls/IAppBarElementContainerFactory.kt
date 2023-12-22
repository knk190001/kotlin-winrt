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

@ABIMarker(IAppBarElementContainerFactory.ABI::class)
@Signature("{0664bf62-1fab-5873-9608-117c3b4483ff}")
@Guid("0664bf621fab58739608117c3b4483ff")
@WinRTInterface("0664bf621fab58739608117c3b4483ff")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBarElementContainerFactory.ByReference::class)
public interface IAppBarElementContainerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      AppBarElementContainer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBarElementContainerFactory> {
    public override fun getValue() = ABI.makeIAppBarElementContainerFactory(pointer.getPointer(0))

    public fun setValue(value: IAppBarElementContainerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBarElementContainerFactory {
    public val __66221420_Ptr: Pointer?

    public val _66221420_VtblPtr: Pointer?
      get() = __66221420_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        AppBarElementContainer? {
      val fnPtr = _66221420_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBarElementContainer>()
      val hr = fn.invokeHR(arrayOf(__66221420_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBarElementContainer>(result.getValue())
      return resultValue
    }
  }

  public class IAppBarElementContainerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __66221420_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBarElementContainerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0664bf621fab58739608117c3b4483ff")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBarElementContainerFactory(ptr: Pointer?): WithDefault =
        IAppBarElementContainerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBarElementContainerFactory {
      val address = segment.toRawLongValue()
      return makeIAppBarElementContainerFactory(Pointer(address))
    }

    public override fun toNative(obj: IAppBarElementContainerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__66221420_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBarElementContainerFactory):
        Array<IAppBarElementContainerFactory?> = (elements as
        Array<IAppBarElementContainerFactory?>).castToImpl<IAppBarElementContainerFactory,IAppBarElementContainerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBarElementContainerFactory?> =
        arrayOfNulls<IAppBarElementContainerFactory_Impl>(size) as
        Array<IAppBarElementContainerFactory?>
  }
}
