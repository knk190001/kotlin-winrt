package Windows.Networking.BackgroundTransfer

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBackgroundTransferGroup.ABI::class)
@Signature("{d8c3e3e4-6459-4540-85eb-aaa1c8903677}")
@Guid("d8c3e3e46459454085ebaaa1c8903677")
@WinRTInterface("d8c3e3e46459454085ebaaa1c8903677")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundTransferGroup.ByReference::class)
public interface IBackgroundTransferGroup : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun get_TransferBehavior(): BackgroundTransferBehavior?

  @InterfaceMethod(2)
  public fun put_TransferBehavior(value: BackgroundTransferBehavior?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundTransferGroup> {
    public override fun getValue() = ABI.makeIBackgroundTransferGroup(pointer.getPointer(0))

    public fun setValue(value: IBackgroundTransferGroup_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundTransferGroup {
    public val __834917787_Ptr: Pointer?

    public val _834917787_VtblPtr: Pointer?
      get() = __834917787_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _834917787_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__834917787_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TransferBehavior(): BackgroundTransferBehavior? {
      val fnPtr = _834917787_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BackgroundTransferBehavior>()
      val hr = fn.invokeHR(arrayOf(__834917787_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BackgroundTransferBehavior>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_TransferBehavior(value: BackgroundTransferBehavior?): Unit {
      val fnPtr = _834917787_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__834917787_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBackgroundTransferGroup_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __834917787_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundTransferGroup, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d8c3e3e46459454085ebaaa1c8903677")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundTransferGroup(ptr: Pointer?): WithDefault =
        IBackgroundTransferGroup_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundTransferGroup {
      val address = segment.toRawLongValue()
      return makeIBackgroundTransferGroup(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundTransferGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__834917787_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundTransferGroup):
        Array<IBackgroundTransferGroup?> = (elements as
        Array<IBackgroundTransferGroup?>).castToImpl<IBackgroundTransferGroup,IBackgroundTransferGroup_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundTransferGroup?> =
        arrayOfNulls<IBackgroundTransferGroup_Impl>(size) as Array<IBackgroundTransferGroup?>
  }
}
