package Microsoft.UI.Input.DragDrop

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

@ABIMarker(IDropOperationTargetRequestedEventArgs.ABI::class)
@Signature("{f61c5b62-720e-59ff-ad0b-e77fc5b8a4a3}")
@Guid("f61c5b62720e59ffad0be77fc5b8a4a3")
@WinRTInterface("f61c5b62720e59ffad0be77fc5b8a4a3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDropOperationTargetRequestedEventArgs.ByReference::class)
public interface IDropOperationTargetRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetTarget(target: IDropOperationTarget?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDropOperationTargetRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIDropOperationTargetRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDropOperationTargetRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDropOperationTargetRequestedEventArgs {
    public val __1410600022_Ptr: Pointer?

    public val _1410600022_VtblPtr: Pointer?
      get() = __1410600022_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetTarget(target: IDropOperationTarget?): Unit {
      val fnPtr = _1410600022_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1410600022_Ptr, marshalToNative(target),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDropOperationTargetRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1410600022_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDropOperationTargetRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f61c5b62720e59ffad0be77fc5b8a4a3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDropOperationTargetRequestedEventArgs(ptr: Pointer?): WithDefault =
        IDropOperationTargetRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDropOperationTargetRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIDropOperationTargetRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDropOperationTargetRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1410600022_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDropOperationTargetRequestedEventArgs):
        Array<IDropOperationTargetRequestedEventArgs?> = (elements as
        Array<IDropOperationTargetRequestedEventArgs?>).castToImpl<IDropOperationTargetRequestedEventArgs,IDropOperationTargetRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDropOperationTargetRequestedEventArgs?> =
        arrayOfNulls<IDropOperationTargetRequestedEventArgs_Impl>(size) as
        Array<IDropOperationTargetRequestedEventArgs?>
  }
}
