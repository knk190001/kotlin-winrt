package Windows.UI.Composition

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

@ABIMarker(ICompositionPropertySet2.ABI::class)
@Signature("{de80731e-a211-4455-8880-7d0f3f6a44fd}")
@Guid("de80731ea211445588807d0f3f6a44fd")
@WinRTInterface("de80731ea211445588807d0f3f6a44fd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionPropertySet2.ByReference::class)
public interface ICompositionPropertySet2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun InsertBoolean(propertyName: String?, value: Boolean): Unit

  @InterfaceMethod(1)
  public fun TryGetBoolean(propertyName: String?, value: Boolean): CompositionGetValueStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionPropertySet2> {
    public override fun getValue() = ABI.makeICompositionPropertySet2(pointer.getPointer(0))

    public fun setValue(value: ICompositionPropertySet2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionPropertySet2 {
    public val __1203916063_Ptr: Pointer?

    public val _1203916063_VtblPtr: Pointer?
      get() = __1203916063_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun InsertBoolean(propertyName: String?, value: Boolean): Unit {
      val fnPtr = _1203916063_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1203916063_Ptr, marshalToNative(propertyName), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun TryGetBoolean(propertyName: String?, value: Boolean):
        CompositionGetValueStatus? {
      val fnPtr = _1203916063_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionGetValueStatus>()
      val hr = fn.invokeHR(arrayOf(__1203916063_Ptr, marshalToNative(propertyName), value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionGetValueStatus>(result.getValue())
      return resultValue
    }
  }

  public class ICompositionPropertySet2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1203916063_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionPropertySet2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("de80731ea211445588807d0f3f6a44fd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionPropertySet2(ptr: Pointer?): WithDefault =
        ICompositionPropertySet2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionPropertySet2 {
      val address = segment.toRawLongValue()
      return makeICompositionPropertySet2(Pointer(address))
    }

    public override fun toNative(obj: ICompositionPropertySet2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1203916063_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionPropertySet2):
        Array<ICompositionPropertySet2?> = (elements as
        Array<ICompositionPropertySet2?>).castToImpl<ICompositionPropertySet2,ICompositionPropertySet2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionPropertySet2?> =
        arrayOfNulls<ICompositionPropertySet2_Impl>(size) as Array<ICompositionPropertySet2?>
  }
}
