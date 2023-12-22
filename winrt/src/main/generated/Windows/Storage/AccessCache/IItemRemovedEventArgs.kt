package Windows.Storage.AccessCache

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

@ABIMarker(IItemRemovedEventArgs.ABI::class)
@Signature("{59677e5c-55be-4c66-ba66-5eaea79d2631}")
@Guid("59677e5c55be4c66ba665eaea79d2631")
@WinRTInterface("59677e5c55be4c66ba665eaea79d2631")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemRemovedEventArgs.ByReference::class)
public interface IItemRemovedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RemovedEntry(): AccessListEntry?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemRemovedEventArgs> {
    public override fun getValue() = ABI.makeIItemRemovedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IItemRemovedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemRemovedEventArgs {
    public val __1585380365_Ptr: Pointer?

    public val _1585380365_VtblPtr: Pointer?
      get() = __1585380365_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RemovedEntry(): AccessListEntry? {
      val fnPtr = _1585380365_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AccessListEntry>()
      val hr = fn.invokeHR(arrayOf(__1585380365_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AccessListEntry>(result.getValue())
      return resultValue
    }
  }

  public class IItemRemovedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1585380365_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemRemovedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("59677e5c55be4c66ba665eaea79d2631")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemRemovedEventArgs(ptr: Pointer?): WithDefault =
        IItemRemovedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemRemovedEventArgs {
      val address = segment.toRawLongValue()
      return makeIItemRemovedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IItemRemovedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1585380365_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemRemovedEventArgs): Array<IItemRemovedEventArgs?> =
        (elements as
        Array<IItemRemovedEventArgs?>).castToImpl<IItemRemovedEventArgs,IItemRemovedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemRemovedEventArgs?> =
        arrayOfNulls<IItemRemovedEventArgs_Impl>(size) as Array<IItemRemovedEventArgs?>
  }
}
