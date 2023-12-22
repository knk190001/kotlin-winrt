package Windows.ApplicationModel.Core

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(ICoreImmersiveApplication.ABI::class)
@Signature("{1ada0e3e-e4a2-4123-b451-dc96bf800419}")
@Guid("1ada0e3ee4a24123b451dc96bf800419")
@WinRTInterface("1ada0e3ee4a24123b451dc96bf800419")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreImmersiveApplication.ByReference::class)
public interface ICoreImmersiveApplication : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Views(): IVectorView<CoreApplicationView?>?

  @InterfaceMethod(1)
  public fun CreateNewView(runtimeType: String?, entryPoint: String?): CoreApplicationView?

  @InterfaceMethod(2)
  public fun get_MainView(): CoreApplicationView?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreImmersiveApplication> {
    public override fun getValue() = ABI.makeICoreImmersiveApplication(pointer.getPointer(0))

    public fun setValue(value: ICoreImmersiveApplication_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreImmersiveApplication {
    public val __361941004_Ptr: Pointer?

    public val _361941004_VtblPtr: Pointer?
      get() = __361941004_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Views(): IVectorView<CoreApplicationView?>? {
      val fnPtr = _361941004_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<CoreApplicationView?>>()
      val hr = fn.invokeHR(arrayOf(__361941004_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<CoreApplicationView?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateNewView(runtimeType: String?, entryPoint: String?):
        CoreApplicationView? {
      val fnPtr = _361941004_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreApplicationView>()
      val hr = fn.invokeHR(arrayOf(__361941004_Ptr, marshalToNative(runtimeType),
          marshalToNative(entryPoint), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreApplicationView>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MainView(): CoreApplicationView? {
      val fnPtr = _361941004_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreApplicationView>()
      val hr = fn.invokeHR(arrayOf(__361941004_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreApplicationView>(result.getValue())
      return resultValue
    }
  }

  public class ICoreImmersiveApplication_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __361941004_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreImmersiveApplication, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1ada0e3ee4a24123b451dc96bf800419")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreImmersiveApplication(ptr: Pointer?): WithDefault =
        ICoreImmersiveApplication_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreImmersiveApplication {
      val address = segment.toRawLongValue()
      return makeICoreImmersiveApplication(Pointer(address))
    }

    public override fun toNative(obj: ICoreImmersiveApplication): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__361941004_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreImmersiveApplication):
        Array<ICoreImmersiveApplication?> = (elements as
        Array<ICoreImmersiveApplication?>).castToImpl<ICoreImmersiveApplication,ICoreImmersiveApplication_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreImmersiveApplication?> =
        arrayOfNulls<ICoreImmersiveApplication_Impl>(size) as Array<ICoreImmersiveApplication?>
  }
}
