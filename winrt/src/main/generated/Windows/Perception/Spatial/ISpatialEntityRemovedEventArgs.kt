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

@ABIMarker(ISpatialEntityRemovedEventArgs.ABI::class)
@Signature("{91741800-536d-4e9f-abf6-415b5444d651}")
@Guid("91741800536d4e9fabf6415b5444d651")
@WinRTInterface("91741800536d4e9fabf6415b5444d651")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialEntityRemovedEventArgs.ByReference::class)
public interface ISpatialEntityRemovedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Entity(): SpatialEntity?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialEntityRemovedEventArgs> {
    public override fun getValue() = ABI.makeISpatialEntityRemovedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISpatialEntityRemovedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialEntityRemovedEventArgs {
    public val __1117299227_Ptr: Pointer?

    public val _1117299227_VtblPtr: Pointer?
      get() = __1117299227_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Entity(): SpatialEntity? {
      val fnPtr = _1117299227_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialEntity>()
      val hr = fn.invokeHR(arrayOf(__1117299227_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialEntity>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialEntityRemovedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1117299227_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialEntityRemovedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("91741800536d4e9fabf6415b5444d651")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialEntityRemovedEventArgs(ptr: Pointer?): WithDefault =
        ISpatialEntityRemovedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialEntityRemovedEventArgs {
      val address = segment.toRawLongValue()
      return makeISpatialEntityRemovedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISpatialEntityRemovedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1117299227_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialEntityRemovedEventArgs):
        Array<ISpatialEntityRemovedEventArgs?> = (elements as
        Array<ISpatialEntityRemovedEventArgs?>).castToImpl<ISpatialEntityRemovedEventArgs,ISpatialEntityRemovedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialEntityRemovedEventArgs?> =
        arrayOfNulls<ISpatialEntityRemovedEventArgs_Impl>(size) as
        Array<ISpatialEntityRemovedEventArgs?>
  }
}
