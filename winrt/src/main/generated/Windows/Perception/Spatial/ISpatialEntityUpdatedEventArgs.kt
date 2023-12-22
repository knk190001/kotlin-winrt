package Windows.Perception.Spatial

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

@ABIMarker(ISpatialEntityUpdatedEventArgs.ABI::class)
@Signature("{e5671766-627b-43cb-a49f-b3be6d47deed}")
@Guid("e5671766627b43cba49fb3be6d47deed")
@WinRTInterface("e5671766627b43cba49fb3be6d47deed")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialEntityUpdatedEventArgs.ByReference::class)
public interface ISpatialEntityUpdatedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Entity(): SpatialEntity?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialEntityUpdatedEventArgs> {
    public override fun getValue() = ABI.makeISpatialEntityUpdatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISpatialEntityUpdatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialEntityUpdatedEventArgs {
    public val __1201532896_Ptr: Pointer?

    public val _1201532896_VtblPtr: Pointer?
      get() = __1201532896_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Entity(): SpatialEntity? {
      val fnPtr = _1201532896_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialEntity>()
      val hr = fn.invokeHR(arrayOf(__1201532896_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialEntity>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialEntityUpdatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1201532896_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialEntityUpdatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e5671766627b43cba49fb3be6d47deed")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialEntityUpdatedEventArgs(ptr: Pointer?): WithDefault =
        ISpatialEntityUpdatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialEntityUpdatedEventArgs {
      val address = segment.toRawLongValue()
      return makeISpatialEntityUpdatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISpatialEntityUpdatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1201532896_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialEntityUpdatedEventArgs):
        Array<ISpatialEntityUpdatedEventArgs?> = (elements as
        Array<ISpatialEntityUpdatedEventArgs?>).castToImpl<ISpatialEntityUpdatedEventArgs,ISpatialEntityUpdatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialEntityUpdatedEventArgs?> =
        arrayOfNulls<ISpatialEntityUpdatedEventArgs_Impl>(size) as
        Array<ISpatialEntityUpdatedEventArgs?>
  }
}
