package Windows.UI.Composition

import Windows.UI.Core.CoreDispatcher
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

@ABIMarker(ICompositionObject.ABI::class)
@Signature("{bcb4ad45-7609-4550-934f-16002a68fded}")
@Guid("bcb4ad4576094550934f16002a68fded")
@WinRTInterface("bcb4ad4576094550934f16002a68fded")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionObject.ByReference::class)
public interface ICompositionObject : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Compositor(): Compositor?

  @InterfaceMethod(1)
  public fun get_Dispatcher(): CoreDispatcher?

  @InterfaceMethod(2)
  public fun get_Properties(): CompositionPropertySet?

  @InterfaceMethod(3)
  public fun StartAnimation(propertyName: String?, animation: CompositionAnimation?): Unit

  @InterfaceMethod(4)
  public fun StopAnimation(propertyName: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionObject> {
    public override fun getValue() = ABI.makeICompositionObject(pointer.getPointer(0))

    public fun setValue(value: ICompositionObject_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionObject {
    public val __1150475163_Ptr: Pointer?

    public val _1150475163_VtblPtr: Pointer?
      get() = __1150475163_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Compositor(): Compositor? {
      val fnPtr = _1150475163_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Compositor>()
      val hr = fn.invokeHR(arrayOf(__1150475163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Compositor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Dispatcher(): CoreDispatcher? {
      val fnPtr = _1150475163_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreDispatcher>()
      val hr = fn.invokeHR(arrayOf(__1150475163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreDispatcher>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Properties(): CompositionPropertySet? {
      val fnPtr = _1150475163_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionPropertySet>()
      val hr = fn.invokeHR(arrayOf(__1150475163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionPropertySet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun StartAnimation(propertyName: String?, animation: CompositionAnimation?):
        Unit {
      val fnPtr = _1150475163_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1150475163_Ptr, marshalToNative(propertyName),
          marshalToNative(animation),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun StopAnimation(propertyName: String?): Unit {
      val fnPtr = _1150475163_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1150475163_Ptr, marshalToNative(propertyName),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionObject_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1150475163_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionObject, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bcb4ad4576094550934f16002a68fded")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionObject(ptr: Pointer?): WithDefault = ICompositionObject_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionObject {
      val address = segment.toRawLongValue()
      return makeICompositionObject(Pointer(address))
    }

    public override fun toNative(obj: ICompositionObject): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1150475163_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionObject): Array<ICompositionObject?> =
        (elements as
        Array<ICompositionObject?>).castToImpl<ICompositionObject,ICompositionObject_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionObject?> =
        arrayOfNulls<ICompositionObject_Impl>(size) as Array<ICompositionObject?>
  }
}
