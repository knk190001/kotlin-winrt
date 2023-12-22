package Windows.UI.ViewManagement.Core

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreInputViewOcclusionsChangedEventArgs.ABI::class)
@Signature("{be1027e8-b3ee-4df7-9554-89cdc66082c2}")
@Guid("be1027e8b3ee4df7955489cdc66082c2")
@WinRTInterface("be1027e8b3ee4df7955489cdc66082c2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreInputViewOcclusionsChangedEventArgs.ByReference::class)
public interface ICoreInputViewOcclusionsChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Occlusions(): IVectorView<CoreInputViewOcclusion?>?

  @InterfaceMethod(1)
  public fun get_Handled(): Boolean

  @InterfaceMethod(2)
  public fun put_Handled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreInputViewOcclusionsChangedEventArgs> {
    public override fun getValue() =
        ABI.makeICoreInputViewOcclusionsChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreInputViewOcclusionsChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreInputViewOcclusionsChangedEventArgs {
    public val __1622716474_Ptr: Pointer?

    public val _1622716474_VtblPtr: Pointer?
      get() = __1622716474_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Occlusions(): IVectorView<CoreInputViewOcclusion?>? {
      val fnPtr = _1622716474_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<CoreInputViewOcclusion?>>()
      val hr = fn.invokeHR(arrayOf(__1622716474_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<CoreInputViewOcclusion?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1622716474_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1622716474_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1622716474_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1622716474_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreInputViewOcclusionsChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1622716474_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreInputViewOcclusionsChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("be1027e8b3ee4df7955489cdc66082c2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreInputViewOcclusionsChangedEventArgs(ptr: Pointer?): WithDefault =
        ICoreInputViewOcclusionsChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreInputViewOcclusionsChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreInputViewOcclusionsChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreInputViewOcclusionsChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1622716474_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreInputViewOcclusionsChangedEventArgs):
        Array<ICoreInputViewOcclusionsChangedEventArgs?> = (elements as
        Array<ICoreInputViewOcclusionsChangedEventArgs?>).castToImpl<ICoreInputViewOcclusionsChangedEventArgs,ICoreInputViewOcclusionsChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreInputViewOcclusionsChangedEventArgs?> =
        arrayOfNulls<ICoreInputViewOcclusionsChangedEventArgs_Impl>(size) as
        Array<ICoreInputViewOcclusionsChangedEventArgs?>
  }
}
