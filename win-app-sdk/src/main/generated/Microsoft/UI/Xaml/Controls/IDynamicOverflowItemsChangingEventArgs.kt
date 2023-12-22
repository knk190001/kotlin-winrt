package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IDynamicOverflowItemsChangingEventArgs.ABI::class)
@Signature("{bf64c37f-6332-541d-80f1-876c5bb9b196}")
@Guid("bf64c37f6332541d80f1876c5bb9b196")
@WinRTInterface("bf64c37f6332541d80f1876c5bb9b196")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDynamicOverflowItemsChangingEventArgs.ByReference::class)
public interface IDynamicOverflowItemsChangingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Action(): CommandBarDynamicOverflowAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDynamicOverflowItemsChangingEventArgs> {
    public override fun getValue() =
        ABI.makeIDynamicOverflowItemsChangingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDynamicOverflowItemsChangingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDynamicOverflowItemsChangingEventArgs {
    public val __462965284_Ptr: Pointer?

    public val _462965284_VtblPtr: Pointer?
      get() = __462965284_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Action(): CommandBarDynamicOverflowAction? {
      val fnPtr = _462965284_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CommandBarDynamicOverflowAction>()
      val hr = fn.invokeHR(arrayOf(__462965284_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CommandBarDynamicOverflowAction>(result.getValue())
      return resultValue
    }
  }

  public class IDynamicOverflowItemsChangingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __462965284_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDynamicOverflowItemsChangingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bf64c37f6332541d80f1876c5bb9b196")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDynamicOverflowItemsChangingEventArgs(ptr: Pointer?): WithDefault =
        IDynamicOverflowItemsChangingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDynamicOverflowItemsChangingEventArgs {
      val address = segment.toRawLongValue()
      return makeIDynamicOverflowItemsChangingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDynamicOverflowItemsChangingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__462965284_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDynamicOverflowItemsChangingEventArgs):
        Array<IDynamicOverflowItemsChangingEventArgs?> = (elements as
        Array<IDynamicOverflowItemsChangingEventArgs?>).castToImpl<IDynamicOverflowItemsChangingEventArgs,IDynamicOverflowItemsChangingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDynamicOverflowItemsChangingEventArgs?> =
        arrayOfNulls<IDynamicOverflowItemsChangingEventArgs_Impl>(size) as
        Array<IDynamicOverflowItemsChangingEventArgs?>
  }
}
