package Windows.Perception.Spatial

import Windows.Foundation.Collections.IMapView
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

@ABIMarker(ISpatialAnchorStore.ABI::class)
@Signature("{b0bc3636-486a-3cb0-9e6f-1245165c4db6}")
@Guid("b0bc3636486a3cb09e6f1245165c4db6")
@WinRTInterface("b0bc3636486a3cb09e6f1245165c4db6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialAnchorStore.ByReference::class)
public interface ISpatialAnchorStore : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAllSavedAnchors(): IMapView<String?, SpatialAnchor?>?

  @InterfaceMethod(1)
  public fun TrySave(id: String?, anchor: SpatialAnchor?): Boolean

  @InterfaceMethod(2)
  public fun Remove(id: String?): Unit

  @InterfaceMethod(3)
  public fun Clear(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialAnchorStore> {
    public override fun getValue() = ABI.makeISpatialAnchorStore(pointer.getPointer(0))

    public fun setValue(value: ISpatialAnchorStore_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialAnchorStore {
    public val __1685548085_Ptr: Pointer?

    public val _1685548085_VtblPtr: Pointer?
      get() = __1685548085_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAllSavedAnchors(): IMapView<String?, SpatialAnchor?>? {
      val fnPtr = _1685548085_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, SpatialAnchor?>>()
      val hr = fn.invokeHR(arrayOf(__1685548085_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, SpatialAnchor?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TrySave(id: String?, anchor: SpatialAnchor?): Boolean {
      val fnPtr = _1685548085_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1685548085_Ptr, marshalToNative(id), marshalToNative(anchor),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun Remove(id: String?): Unit {
      val fnPtr = _1685548085_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1685548085_Ptr, marshalToNative(id),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun Clear(): Unit {
      val fnPtr = _1685548085_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1685548085_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISpatialAnchorStore_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1685548085_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialAnchorStore, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b0bc3636486a3cb09e6f1245165c4db6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialAnchorStore(ptr: Pointer?): WithDefault = ISpatialAnchorStore_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialAnchorStore {
      val address = segment.toRawLongValue()
      return makeISpatialAnchorStore(Pointer(address))
    }

    public override fun toNative(obj: ISpatialAnchorStore): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1685548085_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialAnchorStore): Array<ISpatialAnchorStore?> =
        (elements as
        Array<ISpatialAnchorStore?>).castToImpl<ISpatialAnchorStore,ISpatialAnchorStore_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialAnchorStore?> =
        arrayOfNulls<ISpatialAnchorStore_Impl>(size) as Array<ISpatialAnchorStore?>
  }
}
