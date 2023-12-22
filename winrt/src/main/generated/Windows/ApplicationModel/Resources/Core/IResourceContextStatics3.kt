package Windows.ApplicationModel.Resources.Core

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

@ABIMarker(IResourceContextStatics3.ABI::class)
@Signature("{20cf492c-af0f-450b-9da6-106dd0c29a39}")
@Guid("20cf492caf0f450b9da6106dd0c29a39")
@WinRTInterface("20cf492caf0f450b9da6106dd0c29a39")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IResourceContextStatics3.ByReference::class)
public interface IResourceContextStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetGlobalQualifierValue(
    key: String?,
    value: String?,
    persistence: ResourceQualifierPersistence?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IResourceContextStatics3> {
    public override fun getValue() = ABI.makeIResourceContextStatics3(pointer.getPointer(0))

    public fun setValue(value: IResourceContextStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IResourceContextStatics3 {
    public val __1445083800_Ptr: Pointer?

    public val _1445083800_VtblPtr: Pointer?
      get() = __1445083800_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetGlobalQualifierValue(
      key: String?,
      value: String?,
      persistence: ResourceQualifierPersistence?
    ): Unit {
      val fnPtr = _1445083800_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1445083800_Ptr, marshalToNative(key), marshalToNative(value),
          marshalToNative(persistence),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IResourceContextStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1445083800_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IResourceContextStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("20cf492caf0f450b9da6106dd0c29a39")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIResourceContextStatics3(ptr: Pointer?): WithDefault =
        IResourceContextStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IResourceContextStatics3 {
      val address = segment.toRawLongValue()
      return makeIResourceContextStatics3(Pointer(address))
    }

    public override fun toNative(obj: IResourceContextStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1445083800_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IResourceContextStatics3):
        Array<IResourceContextStatics3?> = (elements as
        Array<IResourceContextStatics3?>).castToImpl<IResourceContextStatics3,IResourceContextStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IResourceContextStatics3?> =
        arrayOfNulls<IResourceContextStatics3_Impl>(size) as Array<IResourceContextStatics3?>
  }
}
