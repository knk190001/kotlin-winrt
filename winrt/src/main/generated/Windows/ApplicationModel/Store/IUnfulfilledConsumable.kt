package Windows.ApplicationModel.Store

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

@ABIMarker(IUnfulfilledConsumable.ABI::class)
@Signature("{2df7fbbb-1cdd-4cb8-a014-7b9cf8986927}")
@Guid("2df7fbbb1cdd4cb8a0147b9cf8986927")
@WinRTInterface("2df7fbbb1cdd4cb8a0147b9cf8986927")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUnfulfilledConsumable.ByReference::class)
public interface IUnfulfilledConsumable : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ProductId(): String?

  @InterfaceMethod(1)
  public fun get_TransactionId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(2)
  public fun get_OfferId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUnfulfilledConsumable> {
    public override fun getValue() = ABI.makeIUnfulfilledConsumable(pointer.getPointer(0))

    public fun setValue(value: IUnfulfilledConsumable_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUnfulfilledConsumable {
    public val __1118556151_Ptr: Pointer?

    public val _1118556151_VtblPtr: Pointer?
      get() = __1118556151_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ProductId(): String? {
      val fnPtr = _1118556151_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1118556151_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TransactionId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1118556151_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1118556151_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_OfferId(): String? {
      val fnPtr = _1118556151_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1118556151_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IUnfulfilledConsumable_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1118556151_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUnfulfilledConsumable, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2df7fbbb1cdd4cb8a0147b9cf8986927")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUnfulfilledConsumable(ptr: Pointer?): WithDefault =
        IUnfulfilledConsumable_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUnfulfilledConsumable {
      val address = segment.toRawLongValue()
      return makeIUnfulfilledConsumable(Pointer(address))
    }

    public override fun toNative(obj: IUnfulfilledConsumable): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1118556151_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUnfulfilledConsumable): Array<IUnfulfilledConsumable?> =
        (elements as
        Array<IUnfulfilledConsumable?>).castToImpl<IUnfulfilledConsumable,IUnfulfilledConsumable_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUnfulfilledConsumable?> =
        arrayOfNulls<IUnfulfilledConsumable_Impl>(size) as Array<IUnfulfilledConsumable?>
  }
}
