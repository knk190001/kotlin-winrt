package Windows.UI.Core

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

@ABIMarker(ICoreWindowDialogFactory.ABI::class)
@Signature("{cfb2a855-1c59-4b13-b1e5-16e29805f7c4}")
@Guid("cfb2a8551c594b13b1e516e29805f7c4")
@WinRTInterface("cfb2a8551c594b13b1e516e29805f7c4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWindowDialogFactory.ByReference::class)
public interface ICoreWindowDialogFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWithTitle(title: String?): CoreWindowDialog?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWindowDialogFactory> {
    public override fun getValue() = ABI.makeICoreWindowDialogFactory(pointer.getPointer(0))

    public fun setValue(value: ICoreWindowDialogFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWindowDialogFactory {
    public val __1913392072_Ptr: Pointer?

    public val _1913392072_VtblPtr: Pointer?
      get() = __1913392072_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWithTitle(title: String?): CoreWindowDialog? {
      val fnPtr = _1913392072_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWindowDialog>()
      val hr = fn.invokeHR(arrayOf(__1913392072_Ptr, marshalToNative(title), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWindowDialog>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWindowDialogFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1913392072_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWindowDialogFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cfb2a8551c594b13b1e516e29805f7c4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWindowDialogFactory(ptr: Pointer?): WithDefault =
        ICoreWindowDialogFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWindowDialogFactory {
      val address = segment.toRawLongValue()
      return makeICoreWindowDialogFactory(Pointer(address))
    }

    public override fun toNative(obj: ICoreWindowDialogFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1913392072_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWindowDialogFactory):
        Array<ICoreWindowDialogFactory?> = (elements as
        Array<ICoreWindowDialogFactory?>).castToImpl<ICoreWindowDialogFactory,ICoreWindowDialogFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWindowDialogFactory?> =
        arrayOfNulls<ICoreWindowDialogFactory_Impl>(size) as Array<ICoreWindowDialogFactory?>
  }
}
