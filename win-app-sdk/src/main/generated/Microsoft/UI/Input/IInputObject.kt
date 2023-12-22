package Microsoft.UI.Input

import Microsoft.UI.Dispatching.DispatcherQueue
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

@ABIMarker(IInputObject.ABI::class)
@Signature("{42edbc88-d386-544d-b1b8-68617fe68282}")
@Guid("42edbc88d386544db1b868617fe68282")
@WinRTInterface("42edbc88d386544db1b868617fe68282")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputObject.ByReference::class)
public interface IInputObject : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DispatcherQueue(): DispatcherQueue?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IInputObject> {
    public override fun getValue() = ABI.makeIInputObject(pointer.getPointer(0))

    public fun setValue(value: IInputObject_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputObject {
    public val __294184816_Ptr: Pointer?

    public val _294184816_VtblPtr: Pointer?
      get() = __294184816_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DispatcherQueue(): DispatcherQueue? {
      val fnPtr = _294184816_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DispatcherQueue>()
      val hr = fn.invokeHR(arrayOf(__294184816_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DispatcherQueue>(result.getValue())
      return resultValue
    }
  }

  public class IInputObject_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __294184816_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputObject, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("42edbc88d386544db1b868617fe68282")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputObject(ptr: Pointer?): WithDefault = IInputObject_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputObject {
      val address = segment.toRawLongValue()
      return makeIInputObject(Pointer(address))
    }

    public override fun toNative(obj: IInputObject): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__294184816_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputObject): Array<IInputObject?> = (elements as
        Array<IInputObject?>).castToImpl<IInputObject,IInputObject_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputObject?> =
        arrayOfNulls<IInputObject_Impl>(size) as Array<IInputObject?>
  }
}
