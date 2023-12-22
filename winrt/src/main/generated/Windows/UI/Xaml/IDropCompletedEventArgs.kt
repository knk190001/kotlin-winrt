package Windows.UI.Xaml

import Windows.ApplicationModel.DataTransfer.DataPackageOperation
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

@ABIMarker(IDropCompletedEventArgs.ABI::class)
@Signature("{6c4fc188-95bc-4261-9ec5-21cab677b734}")
@Guid("6c4fc18895bc42619ec521cab677b734")
@WinRTInterface("6c4fc18895bc42619ec521cab677b734")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDropCompletedEventArgs.ByReference::class)
public interface IDropCompletedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DropResult(): DataPackageOperation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDropCompletedEventArgs> {
    public override fun getValue() = ABI.makeIDropCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDropCompletedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDropCompletedEventArgs {
    public val __1379142995_Ptr: Pointer?

    public val _1379142995_VtblPtr: Pointer?
      get() = __1379142995_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DropResult(): DataPackageOperation? {
      val fnPtr = _1379142995_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackageOperation>()
      val hr = fn.invokeHR(arrayOf(__1379142995_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackageOperation>(result.getValue())
      return resultValue
    }
  }

  public class IDropCompletedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1379142995_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDropCompletedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6c4fc18895bc42619ec521cab677b734")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDropCompletedEventArgs(ptr: Pointer?): WithDefault =
        IDropCompletedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDropCompletedEventArgs {
      val address = segment.toRawLongValue()
      return makeIDropCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDropCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1379142995_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDropCompletedEventArgs): Array<IDropCompletedEventArgs?>
        = (elements as
        Array<IDropCompletedEventArgs?>).castToImpl<IDropCompletedEventArgs,IDropCompletedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDropCompletedEventArgs?> =
        arrayOfNulls<IDropCompletedEventArgs_Impl>(size) as Array<IDropCompletedEventArgs?>
  }
}
