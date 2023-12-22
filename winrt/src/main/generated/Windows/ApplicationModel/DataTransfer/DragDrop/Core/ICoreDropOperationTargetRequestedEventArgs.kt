package Windows.ApplicationModel.DataTransfer.DragDrop.Core

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

@ABIMarker(ICoreDropOperationTargetRequestedEventArgs.ABI::class)
@Signature("{2aca929a-5e28-4ea6-829e-29134e665d6d}")
@Guid("2aca929a5e284ea6829e29134e665d6d")
@WinRTInterface("2aca929a5e284ea6829e29134e665d6d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreDropOperationTargetRequestedEventArgs.ByReference::class)
public interface ICoreDropOperationTargetRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetTarget(target: ICoreDropOperationTarget?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreDropOperationTargetRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeICoreDropOperationTargetRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreDropOperationTargetRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreDropOperationTargetRequestedEventArgs {
    public val __1413307035_Ptr: Pointer?

    public val _1413307035_VtblPtr: Pointer?
      get() = __1413307035_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetTarget(target: ICoreDropOperationTarget?): Unit {
      val fnPtr = _1413307035_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1413307035_Ptr, marshalToNative(target),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreDropOperationTargetRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1413307035_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreDropOperationTargetRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2aca929a5e284ea6829e29134e665d6d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreDropOperationTargetRequestedEventArgs(ptr: Pointer?): WithDefault =
        ICoreDropOperationTargetRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreDropOperationTargetRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreDropOperationTargetRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreDropOperationTargetRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1413307035_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreDropOperationTargetRequestedEventArgs):
        Array<ICoreDropOperationTargetRequestedEventArgs?> = (elements as
        Array<ICoreDropOperationTargetRequestedEventArgs?>).castToImpl<ICoreDropOperationTargetRequestedEventArgs,ICoreDropOperationTargetRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreDropOperationTargetRequestedEventArgs?> =
        arrayOfNulls<ICoreDropOperationTargetRequestedEventArgs_Impl>(size) as
        Array<ICoreDropOperationTargetRequestedEventArgs?>
  }
}
