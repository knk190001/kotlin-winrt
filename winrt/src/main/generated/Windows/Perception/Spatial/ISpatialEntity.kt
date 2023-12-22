package Windows.Perception.Spatial

import Windows.Foundation.Collections.ValueSet
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

@ABIMarker(ISpatialEntity.ABI::class)
@Signature("{166de955-e1eb-454c-ba08-e6c0668ddc65}")
@Guid("166de955e1eb454cba08e6c0668ddc65")
@WinRTInterface("166de955e1eb454cba08e6c0668ddc65")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialEntity.ByReference::class)
public interface ISpatialEntity : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun get_Anchor(): SpatialAnchor?

  @InterfaceMethod(2)
  public fun get_Properties(): ValueSet?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISpatialEntity>
      {
    public override fun getValue() = ABI.makeISpatialEntity(pointer.getPointer(0))

    public fun setValue(value: ISpatialEntity_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialEntity {
    public val __1916688356_Ptr: Pointer?

    public val _1916688356_VtblPtr: Pointer?
      get() = __1916688356_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _1916688356_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1916688356_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Anchor(): SpatialAnchor? {
      val fnPtr = _1916688356_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialAnchor>()
      val hr = fn.invokeHR(arrayOf(__1916688356_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialAnchor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Properties(): ValueSet? {
      val fnPtr = _1916688356_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ValueSet>()
      val hr = fn.invokeHR(arrayOf(__1916688356_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ValueSet>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialEntity_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1916688356_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialEntity, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("166de955e1eb454cba08e6c0668ddc65")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialEntity(ptr: Pointer?): WithDefault = ISpatialEntity_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialEntity {
      val address = segment.toRawLongValue()
      return makeISpatialEntity(Pointer(address))
    }

    public override fun toNative(obj: ISpatialEntity): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1916688356_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialEntity): Array<ISpatialEntity?> = (elements as
        Array<ISpatialEntity?>).castToImpl<ISpatialEntity,ISpatialEntity_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialEntity?> =
        arrayOfNulls<ISpatialEntity_Impl>(size) as Array<ISpatialEntity?>
  }
}
