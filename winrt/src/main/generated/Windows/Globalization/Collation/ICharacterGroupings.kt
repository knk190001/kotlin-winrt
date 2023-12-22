package Windows.Globalization.Collation

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVectorView
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.DynamicSignature
import com.github.knk190001.winrtbinding.runtime.annotations.GenericType
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.TypeHash
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.String
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.KTypeProjection
import kotlin.reflect.KVariance
import kotlin.reflect.KVariance.INVARIANT
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@GenericType
@DynamicSignature
@ABIMarker(ICharacterGroupings.ABI::class)
@Guid("b8d20a75d4cf405580e5ce169c226496")
@WinRTByReference(ICharacterGroupings.ByReference::class)
@TypeHash("__2104786111_Type")
public interface ICharacterGroupings : NativeMapped, IWinRTInterface,
    IVectorView<CharacterGrouping?>, IIterable<CharacterGrouping?> {
  public val __2104786111_Ptr: Pointer?

  public val _2104786111_VtblPtr: Pointer?
    get() = __2104786111_Ptr?.getPointer(0)

  public override val __970637876_Type: KType
    get() = IVectorView::class.createType(listOf(
      KTypeProjection(INVARIANT,CharacterGrouping::class.createType()),
    ))

  public override val __1449643190_Type: KType
    get() = IIterable::class.createType(listOf(
      KTypeProjection(INVARIANT,CharacterGrouping::class.createType()),
    ))

  public fun Lookup(text: String?): String?

  public interface WithDefault : ICharacterGroupings {
    public override fun Lookup(text: String?): String? {
      val fnPtr = _2104786111_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2104786111_Ptr,marshalToNative(text),result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = String::class.createType()
      return marshalFromNative<String>(result.getValue(), returnType!!)
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICharacterGroupings> {
    public override fun getValue(): ICharacterGroupings =
        ABI.makeICharacterGroupings(pointer.getPointer(0))

    public fun setValue(value: ICharacterGroupings): Unit {
      pointer = value.__2104786111_Ptr!!
    }
  }

  public class ICharacterGroupingsImpl(
    ptr: JNAPointer? = NULL
  ) : PointerType(ptr), WithDefault {
    public override val __2104786111_Ptr: JNAPointer?
      get() = pointer

    public override val _2104786111_VtblPtr: JNAPointer?
      get() = pointer.getPointer(0)

    public override val __970637876_Ptr: JNAPointer? by lazy { 
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(guidOf<IVectorView<CharacterGrouping?>>())
      val result = PointerByReference()
      IUnknownVtbl(_2104786111_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public override val __1449643190_Ptr: JNAPointer? by lazy { 
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(guidOf<IIterable<CharacterGrouping?>>())
      val result = PointerByReference()
      IUnknownVtbl(_2104786111_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public companion object {
      public operator fun invoke(ptr: JNAPointer?): ICharacterGroupings =
          ICharacterGroupingsImpl(ptr)
    }
  }

  public object ABI : IABI<ICharacterGroupings, MemoryAddress> {
    public override val layout: ValueLayout = ADDRESS

    public fun makeICharacterGroupings(ptr: JNAPointer?) = ICharacterGroupingsImpl( ptr)

    public override fun fromNative(segment: MemoryAddress): ICharacterGroupings {
      val address = segment.toRawLongValue()
      return makeICharacterGroupings(Pointer(address))
    }

    public override fun toNative(obj: ICharacterGroupings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2104786111_Ptr))
  }
}
