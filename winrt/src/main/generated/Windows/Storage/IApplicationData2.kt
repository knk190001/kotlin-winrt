package Windows.Storage

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

@ABIMarker(IApplicationData2.ABI::class)
@Signature("{9e65cd69-0ba3-4e32-be29-b02de6607638}")
@Guid("9e65cd690ba34e32be29b02de6607638")
@WinRTInterface("9e65cd690ba34e32be29b02de6607638")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationData2.ByReference::class)
public interface IApplicationData2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LocalCacheFolder(): StorageFolder?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationData2> {
    public override fun getValue() = ABI.makeIApplicationData2(pointer.getPointer(0))

    public fun setValue(value: IApplicationData2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationData2 {
    public val __253967601_Ptr: Pointer?

    public val _253967601_VtblPtr: Pointer?
      get() = __253967601_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LocalCacheFolder(): StorageFolder? {
      val fnPtr = _253967601_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolder>()
      val hr = fn.invokeHR(arrayOf(__253967601_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolder>(result.getValue())
      return resultValue
    }
  }

  public class IApplicationData2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __253967601_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationData2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9e65cd690ba34e32be29b02de6607638")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationData2(ptr: Pointer?): WithDefault = IApplicationData2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationData2 {
      val address = segment.toRawLongValue()
      return makeIApplicationData2(Pointer(address))
    }

    public override fun toNative(obj: IApplicationData2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__253967601_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationData2): Array<IApplicationData2?> = (elements
        as Array<IApplicationData2?>).castToImpl<IApplicationData2,IApplicationData2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationData2?> =
        arrayOfNulls<IApplicationData2_Impl>(size) as Array<IApplicationData2?>
  }
}
