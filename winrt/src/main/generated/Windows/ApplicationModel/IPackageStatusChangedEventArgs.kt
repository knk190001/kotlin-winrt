package Windows.ApplicationModel

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

@ABIMarker(IPackageStatusChangedEventArgs.ABI::class)
@Signature("{437d714d-bd80-4a70-bc50-f6e796509575}")
@Guid("437d714dbd804a70bc50f6e796509575")
@WinRTInterface("437d714dbd804a70bc50f6e796509575")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageStatusChangedEventArgs.ByReference::class)
public interface IPackageStatusChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Package(): Package?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPackageStatusChangedEventArgs> {
    public override fun getValue() = ABI.makeIPackageStatusChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPackageStatusChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageStatusChangedEventArgs {
    public val __170595190_Ptr: Pointer?

    public val _170595190_VtblPtr: Pointer?
      get() = __170595190_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Package(): Package? {
      val fnPtr = _170595190_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Package>()
      val hr = fn.invokeHR(arrayOf(__170595190_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Package>(result.getValue())
      return resultValue
    }
  }

  public class IPackageStatusChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __170595190_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageStatusChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("437d714dbd804a70bc50f6e796509575")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageStatusChangedEventArgs(ptr: Pointer?): WithDefault =
        IPackageStatusChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackageStatusChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPackageStatusChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPackageStatusChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__170595190_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageStatusChangedEventArgs):
        Array<IPackageStatusChangedEventArgs?> = (elements as
        Array<IPackageStatusChangedEventArgs?>).castToImpl<IPackageStatusChangedEventArgs,IPackageStatusChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageStatusChangedEventArgs?> =
        arrayOfNulls<IPackageStatusChangedEventArgs_Impl>(size) as
        Array<IPackageStatusChangedEventArgs?>
  }
}
