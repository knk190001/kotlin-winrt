package Windows.Media.ContentRestrictions

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(RatedContentRestrictions.ABI::class)
@Signature("rc(Windows.Media.ContentRestrictions.RatedContentRestrictions;{3f7f23cb-ba07-4401-a49d-8b9222205723})")
@WinRTByReference(brClass = RatedContentRestrictions.ByReference::class)
public class RatedContentRestrictions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRatedContentRestrictions.WithDefault, IWinRTObject {
  private val __2013377862_Interface: IRatedContentRestrictions.WithDefault by lazy {
    as_2013377862()
  }


  public override val __2013377862_Ptr: JNAPointer? by lazy {
    __2013377862_Interface.__2013377862_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2013377862_Interface)

  public constructor() : this(ABI.activate())

  public constructor(maxAgeRating: WinDef.UINT) : this(ABI.activate(maxAgeRating))

  private fun as_2013377862(): IRatedContentRestrictions.WithDefault {
    if(pointer == NULL) {
      return(IRatedContentRestrictions.ABI.makeIRatedContentRestrictions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRatedContentRestrictions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRatedContentRestrictions.ABI.makeIRatedContentRestrictions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RatedContentRestrictions> {
    public override fun getValue() = RatedContentRestrictions(pointer.getPointer(0))

    public fun setValue(value: RatedContentRestrictions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RatedContentRestrictions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IRatedContentRestrictionsFactory_Instance: IRatedContentRestrictionsFactory by lazy {
      createIRatedContentRestrictionsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.ContentRestrictions.RatedContentRestrictions".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIRatedContentRestrictionsFactory(): IRatedContentRestrictionsFactory {
      val refiid = Guid.REFIID(IRatedContentRestrictionsFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.ContentRestrictions.RatedContentRestrictions".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRatedContentRestrictionsFactory.ABI.makeIRatedContentRestrictionsFactory(factoryActivatorPtr.value))
    }

    public fun activate(maxAgeRating: WinDef.UINT): JNAPointer? =
        IRatedContentRestrictionsFactory_Instance.CreateWithMaxAgeRating(maxAgeRating)?.pointer

    public override fun fromNative(segment: MemoryAddress): RatedContentRestrictions {
      val address = segment.toRawLongValue()
      return RatedContentRestrictions(Pointer(address))
    }

    public override fun toNative(obj: RatedContentRestrictions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
