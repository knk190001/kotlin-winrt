package Microsoft.UI.Xaml

import Microsoft.Windows.ApplicationModel.Resources.IResourceManager
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

@ABIMarker(IResourceManagerRequestedEventArgs.ABI::class)
@Signature("{c35f4cf1-fcd6-5c6b-9be2-4cfaefb68b2a}")
@Guid("c35f4cf1fcd65c6b9be24cfaefb68b2a")
@WinRTInterface("c35f4cf1fcd65c6b9be24cfaefb68b2a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IResourceManagerRequestedEventArgs.ByReference::class)
public interface IResourceManagerRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CustomResourceManager(): IResourceManager?

  @InterfaceMethod(1)
  public fun put_CustomResourceManager(value: IResourceManager?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IResourceManagerRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIResourceManagerRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IResourceManagerRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IResourceManagerRequestedEventArgs {
    public val __1213379199_Ptr: Pointer?

    public val _1213379199_VtblPtr: Pointer?
      get() = __1213379199_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CustomResourceManager(): IResourceManager? {
      val fnPtr = _1213379199_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IResourceManager>()
      val hr = fn.invokeHR(arrayOf(__1213379199_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IResourceManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_CustomResourceManager(value: IResourceManager?): Unit {
      val fnPtr = _1213379199_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1213379199_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IResourceManagerRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1213379199_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IResourceManagerRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c35f4cf1fcd65c6b9be24cfaefb68b2a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIResourceManagerRequestedEventArgs(ptr: Pointer?): WithDefault =
        IResourceManagerRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IResourceManagerRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIResourceManagerRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IResourceManagerRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1213379199_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IResourceManagerRequestedEventArgs):
        Array<IResourceManagerRequestedEventArgs?> = (elements as
        Array<IResourceManagerRequestedEventArgs?>).castToImpl<IResourceManagerRequestedEventArgs,IResourceManagerRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IResourceManagerRequestedEventArgs?> =
        arrayOfNulls<IResourceManagerRequestedEventArgs_Impl>(size) as
        Array<IResourceManagerRequestedEventArgs?>
  }
}
