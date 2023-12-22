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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppInstance.ABI::class)
@Signature("{675f2b47-f25f-4532-9fd6-3633e0634d01}")
@Guid("675f2b47f25f45329fd63633e0634d01")
@WinRTInterface("675f2b47f25f45329fd63633e0634d01")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppInstance.ByReference::class)
public interface IAppInstance : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Key(): String?

  @InterfaceMethod(1)
  public fun get_IsCurrentInstance(): Boolean

  @InterfaceMethod(2)
  public fun RedirectActivationTo(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAppInstance> {
    public override fun getValue() = ABI.makeIAppInstance(pointer.getPointer(0))

    public fun setValue(value: IAppInstance_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppInstance {
    public val __1851251759_Ptr: Pointer?

    public val _1851251759_VtblPtr: Pointer?
      get() = __1851251759_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Key(): String? {
      val fnPtr = _1851251759_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1851251759_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsCurrentInstance(): Boolean {
      val fnPtr = _1851251759_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1851251759_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun RedirectActivationTo(): Unit {
      val fnPtr = _1851251759_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1851251759_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppInstance_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1851251759_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppInstance, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("675f2b47f25f45329fd63633e0634d01")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppInstance(ptr: Pointer?): WithDefault = IAppInstance_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppInstance {
      val address = segment.toRawLongValue()
      return makeIAppInstance(Pointer(address))
    }

    public override fun toNative(obj: IAppInstance): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1851251759_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppInstance): Array<IAppInstance?> = (elements as
        Array<IAppInstance?>).castToImpl<IAppInstance,IAppInstance_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppInstance?> =
        arrayOfNulls<IAppInstance_Impl>(size) as Array<IAppInstance?>
  }
}
