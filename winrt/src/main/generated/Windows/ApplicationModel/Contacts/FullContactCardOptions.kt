package Windows.ApplicationModel.Contacts

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
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(FullContactCardOptions.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.FullContactCardOptions;{8744436c-5cf9-4683-bdca-a1fdebf8dbce})")
@WinRTByReference(brClass = FullContactCardOptions.ByReference::class)
public class FullContactCardOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFullContactCardOptions.WithDefault, IWinRTObject {
  private val __428743159_Interface: IFullContactCardOptions.WithDefault by lazy {
    as_428743159()
  }


  public override val __428743159_Ptr: JNAPointer? by lazy {
    __428743159_Interface.__428743159_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__428743159_Interface)

  public constructor() : this(ABI.activate())

  private fun as_428743159(): IFullContactCardOptions.WithDefault {
    if(pointer == NULL) {
      return(IFullContactCardOptions.ABI.makeIFullContactCardOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFullContactCardOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFullContactCardOptions.ABI.makeIFullContactCardOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FullContactCardOptions> {
    public override fun getValue() = FullContactCardOptions(pointer.getPointer(0))

    public fun setValue(value: FullContactCardOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FullContactCardOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Contacts.FullContactCardOptions".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): FullContactCardOptions {
      val address = segment.toRawLongValue()
      return FullContactCardOptions(Pointer(address))
    }

    public override fun toNative(obj: FullContactCardOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
