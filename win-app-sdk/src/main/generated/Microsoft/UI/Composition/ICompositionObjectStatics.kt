package Microsoft.UI.Composition

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

@ABIMarker(ICompositionObjectStatics.ABI::class)
@Signature("{a091356c-38ae-514c-9b58-ad5c8c7936ad}")
@Guid("a091356c38ae514c9b58ad5c8c7936ad")
@WinRTInterface("a091356c38ae514c9b58ad5c8c7936ad")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionObjectStatics.ByReference::class)
public interface ICompositionObjectStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun StartAnimationWithIAnimationObject(
    target: IAnimationObject?,
    propertyName: String?,
    animation: CompositionAnimation?
  ): Unit

  @InterfaceMethod(1)
  public fun StartAnimationGroupWithIAnimationObject(target: IAnimationObject?,
      animation: ICompositionAnimationBase?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionObjectStatics> {
    public override fun getValue() = ABI.makeICompositionObjectStatics(pointer.getPointer(0))

    public fun setValue(value: ICompositionObjectStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionObjectStatics {
    public val __119826667_Ptr: Pointer?

    public val _119826667_VtblPtr: Pointer?
      get() = __119826667_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun StartAnimationWithIAnimationObject(
      target: IAnimationObject?,
      propertyName: String?,
      animation: CompositionAnimation?
    ): Unit {
      val fnPtr = _119826667_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__119826667_Ptr, marshalToNative(target),
          marshalToNative(propertyName), marshalToNative(animation),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun StartAnimationGroupWithIAnimationObject(target: IAnimationObject?,
        animation: ICompositionAnimationBase?): Unit {
      val fnPtr = _119826667_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__119826667_Ptr, marshalToNative(target),
          marshalToNative(animation),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionObjectStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __119826667_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionObjectStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a091356c38ae514c9b58ad5c8c7936ad")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionObjectStatics(ptr: Pointer?): WithDefault =
        ICompositionObjectStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionObjectStatics {
      val address = segment.toRawLongValue()
      return makeICompositionObjectStatics(Pointer(address))
    }

    public override fun toNative(obj: ICompositionObjectStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__119826667_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionObjectStatics):
        Array<ICompositionObjectStatics?> = (elements as
        Array<ICompositionObjectStatics?>).castToImpl<ICompositionObjectStatics,ICompositionObjectStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionObjectStatics?> =
        arrayOfNulls<ICompositionObjectStatics_Impl>(size) as Array<ICompositionObjectStatics?>
  }
}
